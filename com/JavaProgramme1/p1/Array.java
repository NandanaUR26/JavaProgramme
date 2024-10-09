package com.JavaProgramme1.p1;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] item;
		int i;
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number of items you parchesed:");
		int n=s.nextInt();
		item=new int[n];
		System.out.println("enter the costes of the item:");
		for(i=0;i<n;i++) {
			System.out.println("item number"+i);
			item[i]=s.nextInt();
		}
		System.out.println("_______________________");
		for(i=0;i<n;i++) {
			sum=sum+item[i];
		}
		System.out.println("the total expense is:"+sum);
		System.out.println("_______________________");
		System.out.println("enter the total number of investors;");
		int in=s.nextInt();
		System.out.println("enter their investments;");
		int iv=s.nextInt();
		int total=in*iv;
		System.out.println("total invest ment is:"+total);
		System.out.println("_______________________");
		if(sum>total) {
			System.out.println("the expense is over the budget");
		}
		else {
			System.out.println("the expense is not over the budget");
		}
	}

}
