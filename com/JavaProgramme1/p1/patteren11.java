package com.JavaProgramme1.p1;

import java.util.Scanner;

public class patteren11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int i;
		for( i=1;i<=n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("- ");
			}
			for(int j=1;j<=(2*i-1);j++) {
				
				System.out.print("# ");
			}
			System.out.println();
		}
	}

}
