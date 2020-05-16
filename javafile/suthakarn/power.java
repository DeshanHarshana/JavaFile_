import java.util.Scanner;
class powerr {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number : ");
        int number=sn.nextInt();
        System.out.println("Enter power : ");
        int power=sn.nextInt();
        System.out.println(ItrPow(number, power));
        System.out.println(RecPow(number, power));
    }
    static int ItrPow(int num, int power) 
    {
        int pow = 1;
        for (int i = 0; i < power; i++) {
            pow = pow * num;
        }
        return pow;
    }
    static int RecPow(int num, int power) 
    {
        
        int pow = 1;
        if (power > 0) {
            pow = pow * num;
            pow = pow * RecPow(num, power - 1);
        }
        return pow;
    }
}