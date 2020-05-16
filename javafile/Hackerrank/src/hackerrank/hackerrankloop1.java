
package hackerrank;

import java.util.Scanner;


public class hackerrankloop1 {
private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        for(int i=0; i<=10; i++){
            System.out.println(N + " x " + i + " = " + i*N);
        }

        scanner.close();
    }
}
