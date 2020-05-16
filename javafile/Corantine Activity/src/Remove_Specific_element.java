import java.util.Arrays;

import com.sun.glass.ui.TouchInputSupport;

public class Remove_Specific_element {

	public static void main(String[] args) {
		int arr[]= {2,5,8,6,4};
		System.out.print("Before remove : ");
		printArray(arr);
		System.out.print("After remove : ");
		printArray(remove(8, arr));
		
		
		
		

	}
	
	private static void printArray(int arr[]) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	private static int[] remove(int x, int arr[]) {
		int newarr[]=new int[arr.length-1];
		if(check(x, arr)) {
			int position=getIndex(x, arr)-1;
			
			int c1=0,c2=0;
			for(int i=0; i<arr.length; i++) {
				if(c1==position) {
					c1++;
					continue;
				}
				else {
					newarr[c2]=arr[c1];
					c1++;
					c2++;
				}
			}
	        
			
			
		}
		else {
			System.out.println("Given Number not contain in Array");	
		}
		
		return newarr;
	}	
	private static boolean check(int x, int arr[]) {
		boolean isContain=false;
		for(int i=0; i<arr.length; i++) {
			if(x==arr[i]) {
				isContain=true;
				break;
			}
			else {
				isContain=false;
			}
		}
		
		return isContain;
		
	}
private static int getIndex(int x, int arr[]) {
	int index=0;
	for(int i=0; i<arr.length; i++) {
		if(x==arr[i]) {
			index=i+1;
			break;
		}
	}
	return index;
}
}
