import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number : ");
        int number=sn.nextInt();
        System.out.println(ItrFib(number));
        System.out.println(RecFib(number));
    }

    static int ItrFib(int num) {
        int fib1 = 1, fib2 = 1;
        int sum = 0;
        for (int i = 3; i <= num; i++) 
        {
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
        return (num < 3 & num > 0) ? 1 : sum;
    }

    static int RecFib(int n) 
    {
        
        
        if (n >= 0) {
            if (n == 0) {
                return 0;
            }
            if (n == 1 || n == 2) {
                return 1;
            }

            return RecFib(n - 2) + RecFib(n - 1);
        } else {
            return 0;
        }
        
    }

}
