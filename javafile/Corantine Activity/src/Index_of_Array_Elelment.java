
public class Index_of_Array_Elelment {

	public static void main(String[] args) {
		int arr[]= {2,5,8,6,4};
		
		System.out.println(getIndex(4, arr));

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
