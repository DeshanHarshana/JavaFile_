package com.method;

import java.util.Random;

public class Randomexe {

	public static void main(String[] args) {
		Random random=new Random();
		
			float [] a = null;
		
		for(int i=0; i<100;i++) {
			
			a[i]=random.nextInt(100);
			
		}
		for(float i:a) {
			System.out.println(i);
		}
		
		
	}


	}


