package com.JavaProgramme1.p1;

import java.util.Scanner;

public class pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Scanner s=new Scanner(System.in);
            System.out.println("enter number n:");
            int n=s.nextInt();
            for(int i=1;i<=n;i++) {
            	for(int j=1;j<=i;j++) {
            		if(i==1 || j==i || i==n || j==1)
            			System.out.print("# ");
            		else
            			System.out.print("- ");	
            	}
            	
            	System.out.println();
            }
	}

}

