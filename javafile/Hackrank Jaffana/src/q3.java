import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q3 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int A = Integer.parseInt(firstMultipleInput[0]);

        int B = Integer.parseInt(firstMultipleInput[1]);

        int M = Integer.parseInt(firstMultipleInput[2]);
        
        int max=A%A+1;
        for(int i=A; i<=B; i++) {
        	
        	int rem=i%M;
        	if(max<=rem) {
        		max=rem;
        	}
        }
        System.out.println(max);

        bufferedReader.close();
	}

}
