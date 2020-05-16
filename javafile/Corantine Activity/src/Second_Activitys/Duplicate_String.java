package Second_Activitys;
public class Duplicate_String {
	public static void main(String[] args) {
		String arr[]= {"Deshan","Harshana","Power", "Deshan","Power"};
		find_duplicate(arr);
	}
	public static void find_duplicate(String string[]) {
	String temp="";
	for (int i = 0; i < string.length; i++) {
        boolean duplicate = false;
        for(int j = 0; j < string.length; j++) {
        	//i!=j used for prevent considering same element twice
        	//reason of use boolean value because if it is true then 
        	//there have duplicate value
            if ((i != j) && string[i].equals(string[j])) {
                duplicate = true;
            }
        }
        if (duplicate) {
        	//this check our string has present value
            if(!(temp.contains(String.valueOf(string[i]))))
            {
            	temp+=string[i]+", ";
            }
        }
    }
	//this line need for remove last ","
	//temp= temp.substring(0, temp.length() - 1);
    System.out.println("Duplicates are: "+temp);
	}
}
