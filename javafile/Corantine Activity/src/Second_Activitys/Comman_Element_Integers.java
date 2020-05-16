package Second_Activitys;

import java.util.Arrays;

public class Comman_Element_Integers {

	public static void main(String[] args) {
		int arr1[]= {1,2,5,7,9,10};
		int arr2[]= {2,5,7,3};
		find_duplicate(arr1, arr2);
	}
	public static void find_duplicate(int number1[], int number2[]) {
		String temp="";
		//following code use for different size array
		int longarr[]=Arrays.copyOf(number1, number1.length);
		int shortarr[]=Arrays.copyOf(number2, number2.length);
		if(number1.length>number2.length) {
			shortarr=Arrays.copyOf(number2, number2.length);
			longarr=Arrays.copyOf(number1, number1.length);
		}
		else if(number1.length<number2.length){
			shortarr=Arrays.copyOf(number1, number1.length);
			longarr=Arrays.copyOf(number2, number2.length);
		}
		for (int i = 0; i < shortarr.length; i++) {
	        boolean duplicate = false;
	        for(int j = 0; j < longarr.length; j++) {
	        	//i!=j used for prevent considering same element twice
	        	//reason of use boolean value because if it is true then 
	        	//there have duplicate value
	            if ((i != j) && shortarr[i]==longarr[j]) {
	                duplicate = true;
	            }
	        }
	        if (duplicate) {
	        	//this check our string has present value
	            if(!(temp.contains(String.valueOf(shortarr[i]))))
	            {
	            	temp+=String.valueOf(shortarr[i])+", ";
	            }
	        }
	    }
		//this line need for remove last ","
		//temp= temp.substring(0, temp.length() - 1);
	    System.out.println("Common Values are: "+temp);
		}
	}



