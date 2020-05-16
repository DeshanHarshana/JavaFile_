class Recursion1V2 {
public static void main (String args[])
{
count(0);
// if we want enter after recurtion System.out.println();
}

public static void count (int index)
{
    if (index < 2){
        count(index+1);
    }
System.out.print(index);
    
    }
}