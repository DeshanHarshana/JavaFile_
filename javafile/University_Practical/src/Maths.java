
public class Maths {
	   public static void main(String args[])
	   { 
	    calculate c=new calculate();
	    c.gcd(741,130);
	    c.gcd(4459,1417);
	    c.gcd(49104,66492);
	    c.gcd(3234,5187);
	    c.gcd(1819,3587);
	   }
	 }
	 class calculate{
	   int num[]=new int[4];
	   void gcd(int x, int y){
		   if(y>x) {
			   int tem1=x;
			   int temp2=y;
			   y=tem1;
			   x=temp2;
			   
		   }
	     if(x>y){
	       num[0]=x;
	       num[1]=y;
	       num[3]=1;
	       while(!(num[3]==0)){
	         num[3]=num[0]%num[1];
	         num[2]=num[0]/num[1];
	         System.out.println(num[0] + "="+num[1]+"("+num[2]+")"+"+"+num[3]);
	         num[0]=num[1];
	         num[1]=num[3];
	       }
	       System.out.println("gcd of " + x + "," + y + " is ="+num[0]);
	     }
	   }
	 }