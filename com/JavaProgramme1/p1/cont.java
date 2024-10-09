package com.JavaProgramme1.p1;
import java.util.*;
public class cont {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter thenumber:");
    		   int n=sc.nextInt();
    		   System.out.println("numbres:");
    		   for(int i=1;i<=n;i++) {
    			   if(i%3==0 || i%5==0) {
    			    continue;
    			   }
    			  System.out.println(i); 
    		   }
	}

}
