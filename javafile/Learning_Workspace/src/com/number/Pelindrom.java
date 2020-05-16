package com.number;

public class Pelindrom {

	public static void main(String[] args) {
		int check_num=454 , r,s=0;
		int t= check_num;
		
		while(check_num>0) {
			r=check_num%10;
			check_num=check_num/10;
			s=s*10+r;
			
		}
		if(t==s) {
			System.out.println("Number is Pelindrom. Your Number is : "+ s );
		}
		else {
			System.out.println("Number isn't Pelindrom. Your Number is : "+ s );
		}
		
		

	}

}
