package com.JavaProgramme1.p1;

import java.util.Scanner;

public class pattern8 {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter n value:");
	int n=sc.nextInt();
	int count=1;
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=i;j++) {
			System.out.print(count+"  ");
			count++;
		}
		System.out.println();
	}
}
}
