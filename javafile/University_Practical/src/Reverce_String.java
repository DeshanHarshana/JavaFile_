

public class Reverce_String {

	public static void main(String[] args) {
		String string="Deshan";
		char arr[]=new char[20];
		int i=0;
		for(int j=0; j<string.length(); j++) {
			arr[i]=string.charAt(j);
			i++;
		}
		for(int k=0; k<i; k++) {
			System.out.print(arr[(i-1-k)]);
		}
		

	}

}
