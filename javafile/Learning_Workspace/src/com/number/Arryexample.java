package com.number;

public class Arryexample {

	public static void main(String[] args) {
	int c[][][]=new int[5][5][5];
	
	for(int i=0;i<5;i++) {
		for(int j=0; j<5;j++) {
			for(int k=0;k<5;k++) {
				c[i][j][k]=1;
			}
		}
	}
	
	for(int i=0;i<5;i++) {
		for(int j=0; j<5;j++) {
			for(int k=0;k<5;k++) {
				System.out.print(c[i][j][k]);
			}
			System.out.println();
		}
		System.out.println();
	}
	

	}

}
