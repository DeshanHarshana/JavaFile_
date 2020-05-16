
public class Array_Contain_Specific_Value {

	public static void main(String[] args) {
		int arr[]= {2,5,8,6,4};
		//first parameter is Specific value
		check(5, arr);

	}
	
	private static void check(int x, int arr[]) {
		
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
		if(isContain) {
			System.out.println(x + " is contain in Array");
		}
		else {
			System.out.println(x + " is not contain in Array");
		}
		
	}

}
