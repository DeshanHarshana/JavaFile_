import java.util.Scanner;
public class sumof {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter number : ");
        int number=sn.nextInt();
        System.out.println(ItrSum(number));
        System.out.println(RecSum(number));
    }
    static int ItrSum(int num){
        int sum=0;
        for(int i=1; i<=num; i++)
        {
            sum=sum+i;
        }
        return sum;
    }
    static int RecSum(int num)
    {
        if(num>0){
        int sum=num+RecSum(num-1);
        return sum;
        }
        else{
            return 0;
        }
    }
    
}