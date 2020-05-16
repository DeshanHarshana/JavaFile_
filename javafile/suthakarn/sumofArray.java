import java.util.*;
class Sol{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str0= sc.nextLine();
        String str= sc.nextLine();
        
        String values[] = str.split(" ");
        int items[]=new int[values.length];
        for(int i=0; i<values.length;i++){
            items[i]=Integer.parseInt(values[i]);
        }
        int count=0;
        for (int i = 0; i < items.length; i++)
{
    // j is the number of elements which should be printed
    for (int j = i; j < items.length; j++)
    {
        int sum=0;
        for (int k = i; k <= j; k++)
        {
            
            sum=sum+items[k];
        }
        if(sum<0){
            count++;
        }
       
    }
}
System.out.println(count);
    }
}
    