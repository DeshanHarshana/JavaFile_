import java.util.Random;
class testMatrix{
			int row;
			int col;
			double [][] arr;
			private Random random;
			public testMatrix(int nrows, int ncols)
			{
				this.row=nrows;
				this.col=ncols;
				arr=new double[row][col];
			}
			
			public testMatrix(double [][] data)
			{
				this.arr=data;
			}
			
			public void putRandom()
			{
				random=new Random();
				for(int i=0; i<row; i++){
					for(int j=0; j<col; j++){
						arr[i][j]=random.nextInt(100);
					}
				}
			}
			
			public void swapRows(int i, int j){
				for(int x=0; x<arr[0].length; x++){
					double temp=arr[j][x];
					arr[j][x]=arr[i][x];
					arr[i][x]=temp;
				}
			}
			public void swapColumns(int i, int j){
				for(int x=0; x<arr.length; x++){
					double temp=arr[x][j];
					arr[x][j]=arr[x][i];
					arr[x][i]=temp;
				}
			}
			
			
			public void transpose(){
				double [][] transpose=new double[row][col];
				for(int i=0;i<arr.length;i++){    
				for(int j=0;j<arr[0].length;j++){    
				transpose[i][j]=arr[j][i];  
				}    
				}
				for(int i=0;i<arr.length;i++){    
				for(int j=0;j<arr[0].length;j++){    
				arr[i][j]=transpose[i][j];
				}    
				}
			}
			public int getNRows(){
				return arr.length;
			}
			public int getNCols(){
				return arr[0].length;
			}
			public void add(testMatrix B){
				testMatrix M=new testMatrix(row,col);
				if((B.row==this.row) & (B.col==this.col)){
				for(int i=0; i<row; i++){
					for(int j=0; j<col; j++){
						M.arr[i][j]=arr[i][j]+B.arr[i][j];
					}
					
				}
			}
			else{
				System.out.println("Given Matrix can't add to this Matrix");
			}
			
			}
			public void multiply(testMatrix B){
				if(arr[0].length==B.arr.length) {
					double newMatrix[][]=new double[arr.length][B.arr[0].length];
					for(int i=0; i<arr.length; i++){
		                for(int j=0; j<newMatrix[0].length; j++){
		                    newMatrix[i][j]=0;
		                    for(int k=0; k<B.arr.length; k++){
		                        newMatrix[i][j]+=arr[i][k]*B.arr[k][j];
		                    }
		                   
		                }
		                
		            }
					arr=newMatrix;
		            
		        }
		        
				else {
					System.out.println("Given Matrix can't Multiply");
				}
			}
			public void sub(testMatrix B){
				testMatrix M=new testMatrix(row,col);
				if((B.row==this.row) & (B.col==this.col)){
				for(int i=0; i<row; i++){
					for(int j=0; j<col; j++){
						M.arr[i][j]=arr[i][j]-B.arr[i][j];
					}
				}
			}
			else{
				System.out.println("Given Matrix can't add to this Matrix");
			}
			
			}
			public void print(){
				for(int i=0; i<row; i++){
					System.out.println("\n");
					for(int j=0; j<col; j++){
						System.out.print(arr[i][j]+ "    ");
					}
				}
			}
			public void identity(){
				if(row==col){
					for(int i=0; i<row; i++){
						for(int j=0; j<col; j++){
							if(i==j){
								arr[i][j]=1;
							}
							else{
								arr[i][j]=0;
							}
						}
					}
				}
				else{
					System.out.println("This array is not a Square Matrix");
				}
			}
	
}
class testMatrix{
	public static void main(String [] args){
		testMatrix x=new testMatrix(3,3);
		x.putRandom();
		x.print();
		
		testMatrix y=new testMatrix(3,3);
		y.print();
		
	}
}