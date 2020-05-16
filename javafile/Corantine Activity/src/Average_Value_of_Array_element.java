
public class Average_Value_of_Array_element {

	public static void main(String[] args) {
		int arr[]= {2,5,8,6,4};
		double sum=0;
		for(int i=0; i<arr.length; i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum : " + sum/arr.length);
	}

}
