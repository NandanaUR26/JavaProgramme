package com.JavaProgramme1.p1;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++) {
        	for(j=1;j<=n;j++) {
        		System.out.print(j+" ");
        	}
        	System.out.println();
        }
	}

}
