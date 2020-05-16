package Second_Activitys;
public class Duplicate_Value {
	public static void main(String[] args) {
		int arr[]= {2,2,2,2,4,4,4,5,5,5,6,7};
		find_duplicate(arr);
	}
	public static void find_duplicate(int numbers[]) {
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
	    System.out.println("Duplicates are: "+temp);
	}
}