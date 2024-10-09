package com.JavaProgramme1.p1;
import java.util.*;
public class patteren12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter n value:");
         Scanner s=new Scanner(System.in);
         int n=s.nextInt();
         for(int i=1;i<=n;i++){
        	 for(int j=2;j<=n-1;j++) {
        		 System.out.print(" ");
        	 }
        	 for(int k=n;k>=i;k--)
        	 {
        		 System.out.print(" *");
        	 }
        	 System.out.println();
         }
	}

}
