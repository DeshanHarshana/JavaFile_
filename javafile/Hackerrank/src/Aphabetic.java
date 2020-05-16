import java.util.Arrays;

public class Aphabetic {

	public static void main(String[] args) {
		String name="welcometojava";
		int k=3;
		int groups=name.length()-(k-1);
		
		String namearr[]=new String[groups];
		for(int i=0; i<groups;i++) {
			namearr[i]=name.substring(i, i+k);
		}
		for(int i = 0; i<namearr.length-1; i++) {
	         for (int j = i+1; j<namearr.length; j++) {
	            if(namearr[i].compareTo(namearr[j])>0) {
	               String temp = namearr[i];
	               namearr[i] = namearr[j];
	               namearr[j] = temp;
	            }
	         }
	      }
		System.out.println(namearr[namearr.length-1]);
		
	}

}
