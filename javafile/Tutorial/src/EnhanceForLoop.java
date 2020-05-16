
public class EnhanceForLoop {

	public static void main(String[] args) {
	int arr[] = new int[120];
	for(int i=0; i<100; i++) {
		arr[i]=i;
	}
	for(int i:arr) {
		System.out.println(i);
	}
	}

}
