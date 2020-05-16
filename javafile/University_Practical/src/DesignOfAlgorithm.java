

public class DesignOfAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Algo al1=new Algo();
		
		int arr[]= {3,4,6,9,5,8,0,7,7};
		al1.insertionSort(arr);
		for(int i:arr) {
			System.out.print(i + ",");
		}

	}

}
class Algo{
	 public void selectionSort(int[] arr){  
	        for (int i = 0; i < arr.length - 1; i++)  
	        {  
	            int index = i;  
	            for (int j = i + 1; j < arr.length; j++){  
	                if (arr[j] < arr[index]){  
	                    index = j;//searching for lowest index  
	                }  
	                int smallerNumber = arr[index];   
		            arr[index] = arr[i];  
		            arr[i] = smallerNumber;
	            }  
	              
	        }  
	    }  
	public void insertionSort(int [] p) {
		
		for(int j=0; j<p.length; j++) {
			int key=p[j];
			int i=j-1;
			while((i>-1)&&(p[i]>key)) {
				p[i+1]=p[i];
				i--;
			}
			p[i+1]=key;
			}
		
		}
	 public void bubbleSort(int[] arr) {  
	        int n = arr.length;  
	        int temp = 0;  
	         for(int i=0; i < n; i++){  
	                 for(int j=1; j < (n-i); j++){  
	                          if(arr[j-1] > arr[j]){  
	                                 //swap elements  
	                                 temp = arr[j-1];  
	                                 arr[j-1] = arr[j];  
	                                 arr[j] = temp;  
	                         }  
	                          
	                 }  
	         }  
	  
	    }  
	
	
	
	void fact(int n) {
		int fact=1, i=1;
		while(i<=n) {
			fact=fact*i;
			i=i+1;
		}
		System.out.println("\n"+fact);
	}
	void fib(int n) {
		int fib1=0, fib2=1, count=3, fib3=0;
		System.out.print(fib1+","+fib2);
		while(n>=count) {
			fib3=fib1+fib2;
			System.out.print(","+fib3);
			fib1=fib2;
			fib2=fib3;
			count++;
		}
	}
	
}

