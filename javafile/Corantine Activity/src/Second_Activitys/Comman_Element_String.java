package Second_Activitys;
import java.util.Arrays;
public class Comman_Element_String {
	public static void main(String[] args) {
		String arr1[]= {"Deshan","Harshana","Power", "Deshan","Power","Deshan","Sewwandi","Gayantha"};
		String arr2[]= {"Deshan","Nawarathna","Power", "Sewwandi","Eranga","Amara", "Gayantha", "Rathnayake","PPPP"};
		find_duplicate(arr1, arr2);
	}
	public static void find_duplicate(String string1[], String string2[]) {
		String temp="";
		//following code use for different size array
		String longarr[]=Arrays.copyOf(string2, string2.length);
		String shortarr[]=Arrays.copyOf(string1, string1.length);
		if(string1.length>string2.length) {
			shortarr=Arrays.copyOf(string2, string2.length);
			longarr=Arrays.copyOf(string1, string1.length);
		}
		else if(string1.length<string2.length){
			shortarr=Arrays.copyOf(string1, string1.length);
			longarr=Arrays.copyOf(string2, string2.length);
		}
		for (int i = 0; i < shortarr.length; i++) {
	        boolean duplicate = false;
	        for(int j = 0; j < longarr.length; j++) {
	        	//i!=j used for prevent considering same element twice
	        	//reason of use boolean value because if it is true then 
	        	//there have duplicate value
	            if ((i != j) && shortarr[i].equals(longarr[j])) {
	                duplicate = true;
	            }
	        }
	        if (duplicate) {
	        	//this check our string has present value
	            if(!(temp.contains(String.valueOf(shortarr[i]))))
	            {
	            	temp+=shortarr[i]+", ";
	            }
	        }
	    }
		//this line need for remove last ","
		//temp= temp.substring(0, temp.length() - 1);
	    System.out.println("Common Values are: "+temp);
		}
	}



