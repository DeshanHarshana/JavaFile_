
public class numberPattern {
	
		   public static void main(String args[])
		   { 
		       patternD(7);
		   }
		   static void patternG(int rows){
		     int k = 0, count = 0, count1 = 0;
		        for(int i = 1; i <= rows; ++i) {
		            for(int space = 1; space <= rows - i; ++space) {
		                System.out.print("  ");
		                ++count;
		            }
		            while(k != 2 * i - 1) {
		                if (count <= rows - 1) {
		                    System.out.print((i + k) + " ");
		                    ++count;
		                }
		                else {
		                    ++count1;
		                    System.out.print((i + k - 2 * count1) + " ");
		                }
		                ++k;
		            }
		            count1 = count = k = 0;
		            System.out.println();
		        }
		    }
		   static void pyramid(int size){
		       for(int i=0; i<size; i++){
		           for(int j=size; j>i; j--){
		               System.out.print(" ");
		           }
		           for(int k=0; k<(i); k++){
		               System.out.print(" *");
		           }
		           System.out.println();
		       }
		   }
		   

		    
		      
		        
		    
		    

		   
		   static void patternF(int noOfRows){
		     
		 
		        //Initializing rowCount with noOfRows
		 
		        int rowCount = noOfRows;
		 
		       
		 
		        //Implementing the logic
		 
		        for (int i = 0; i < noOfRows; i++)
		        {
		            //Printing i*2 spaces at the beginning of each row
		 
		            for (int j = 1; j <= i*2; j++)
		            {
		                System.out.print(" ");
		            }
		 
		            //Printing j where j value will be from 1 to rowCount
		 
		            for (int j = 1; j <= rowCount; j++)          
		            {
		                System.out.print(j+" ");
		            }
		 
		            //Printing j where j value will be from rowCount-1 to 1
		             
		            for (int j = rowCount-1; j >= 1; j--)
		            {               
		                System.out.print(j+" ");            
		            }
		             
		            System.out.println();
		 
		            //Decrementing the rowCount
		 
		            rowCount--;
		        }
		    }
		   
		   static void patternD(int rows){
		     
		        for (int i = 1; i <= rows; i++)
		        {
		            for (int j = rows; j > i; j--)
		            {
		                System.out.print("  ");
		            }
		            int val1 = 1;
		            for (int k = 1; k <= i; k++)
		            {

		                System.out.print(" "+val1);
		                val1 = val1 * 2;
		            }
		            val1 = val1 / 4;
		            for (int l = i - 1; l >= 1; l--)
		            {
		                System.out.print(" "+val1);
		                val1 = val1 / 2;
		            }
		            System.out.println();
		        }
		    }

		   static void patternC(int rows){
		     
		        
		        for (int i = 1; i <= rows; i++)
		        {
		            for (int j = 1; j <= i; j++)
		            {
		                System.out.print(j);
		            }
		            
		            for (int j= i*2 ; j < rows*2; j++) 
		            { 
		                System.out.print(" "); 
		            } 
		            for (int l = i; l >= 1; l--)
		            {
		                System.out.print(l);
		            }
		            System.out.println();
		        }
		        
		    }
		    static void patternE(int rows){
		      for (int i = 1; i <= rows; i++) { 
		        for (int l = i - 1; l >= 1; l--) { 
		            System.out.print(l); 
		            }
		            for (int k = 1; k <= i; k++) { 
		          System.out.print(k); 
		          } 
		          for (int j = rows; j > i; j--) { 
		       System.out.print(" "); 
		       }
		       System.out.println(); 
		        }
		    }

		   
		   static void patternB(int rows){
		   for (int i = 1; i <= rows; i++) { 
		     for (int j = rows; j > i; j--) { 
		       System.out.print(" "); 
		       }
		        for (int k = 1; k <= i; k++) { 
		          System.out.print(k); 
		          } 
		          for (int l = i - 1; l >= 1; l--) { 
		            System.out.print(l); 
		            } System.out.println(); 
		            }
		             } 
		             
		   static void patternH(int r){
		     int i, k, number=1, j;
		    
		    for(i=0;i<r;i++)
		    {
		      for(k=r; k>i; k--)
		      {
		        System.out.print("");
		      }
		            number = 1;
		      for(j=0;j<=i;j++)
		      {
		         System.out.print(number+ " ");
		                 number = number * (i - j) / (j + 1);
		      }
		      System.out.println();
		    }
		  }
		   static void patternA(int r){
		     int i, k, number, j;
		    
		    for(i=0;i<r;i++)
		    {
		      for(k=r; k>i; k--)
		      {
		        System.out.print(" ");
		      }
		      number=1;
		      for(j=0;j<=i;j++)
		      {
		         System.out.print(number+ " ");
		                 number = number * (i - j) / (j + 1);
		      }
		      System.out.println();
		    }
		  }
		}


		  

