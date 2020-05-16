package Second_Activitys;

import java.util.Arrays;

public class Remove_Duplicate_Element_From_Array {
	static int arr[]= {2,2,2,2,4,4,4,5,5,5,6,7,7,7,7,9,9,9,10,11,11,12};
	//static String arr2[]= {"Deshan","Harshana","Deshan","Deshan", "Harshana", "Nawarathna"};
	public static void main(String[] args) {
		remove_duplicate_int(arr);
		System.out.println(Arrays.toString(arr));
		
		
		//remove_duplicate_string(arr2);
		//System.out.println(Arrays.toString(arr2));
		
	}
	

	
	public static void remove_duplicate_int(int numbers[]) {
		String temp="";
		for (int i = 0; i < numbers.length; i++) {
	        boolean duplicate = false;
	        for(int j = 0; j < numbers.length; j++) {
	        	//i!=j used for prevent considering same element twice
	        	//reason of use boolean value because if it is true then 
	        	//there have duplicate value
	            if ((i != j) && numbers[i] == numbers[j]) {
	                duplicate = true;
	            }
	        }
	        if (duplicate) {
	        	//this check our string has present value
	            if(!(temp.contains(String.valueOf(numbers[i]))))
	            {
	            	temp+=numbers[i]+",";
	            } 
	        }
	    }
		//this line need for remove last ","
		//temp= temp.substring(0, temp.length() - 1);
	    
	    
	    String removedArray_String[]=temp.split(",");
	    int[] removedArray_Integer=new int[removedArray_String.length];
		for(int i=0; i<removedArray_String.length; i++) {
			removedArray_Integer[i]=Integer.parseInt(removedArray_String[i]);
		}
		for(int i=0; i<removedArray_Integer.length;i++) {
			for(int j=0; j<arr.length; j++) {
				if(removedArray_Integer[i]!=arr[j]) {
					 if(!(temp.contains(String.valueOf(arr[j]))))
			            {
			            	temp+=arr[j]+",";
			            } 
				}
			}
		}
		
		
		String removedArray_String1[]=temp.split(",");
	    int[] removedArray_Integer1=new int[removedArray_String1.length];
		for(int i=0; i<removedArray_String1.length; i++) {
			removedArray_Integer1[i]=Integer.parseInt(removedArray_String1[i]);
		}
		arr=Arrays.copyOf(removedArray_Integer1, removedArray_Integer1.length);
		
	}
	/*
	 * 
	 * if you pass string array then use this method 
	public static void remove_duplicate_string(String numbers[]) {
		String temp="";
		for (int i = 0; i < numbers.length; i++) {
	        boolean duplicate = false;
	        for(int j = 0; j < numbers.length; j++) {
	        	//i!=j used for prevent considering same element twice
	        	//reason of use boolean value because if it is true then 
	        	//there have duplicate value
	            if ((i != j) && numbers[i] == numbers[j]) {
	                duplicate = true;
	            }
	        }
	        if (duplicate) {
	        	//this check our string has present value
	            if(!(temp.contains(String.valueOf(numbers[i]))))
	            {
	            	temp+=numbers[i]+",";
	            } 
	        }
	    }
		//this line need for remove last ","
		//temp= temp.substring(0, temp.length() - 1);
	    
	    
	    String removedArray_String[]=temp.split(",");
	    
		for(int i=0; i<removedArray_String.length;i++) {
			for(int j=0; j<arr2.length; j++) {
				if(removedArray_String[i]!=arr2[j]) {
					 if(!(temp.contains(String.valueOf(arr2[j]))))
			            {
			            	temp+=arr2[j]+",";
			            } 
				}
			}
		}
		
		
		String removedArray_String1[]=temp.split(",");
	    
		arr2=Arrays.copyOf(removedArray_String1, removedArray_String1.length);
		
	}
	*/
	
	
}
	
	
	
	

	
	
	