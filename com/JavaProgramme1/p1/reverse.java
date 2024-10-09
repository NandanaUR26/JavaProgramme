package com.JavaProgramme1.p1;
import java.util.*;
public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the string:");
          String str=sc.nextLine();
          String s="";
          for(int i=str.length()-1;i>=0;i--) {
        	  s+=str.charAt(i);
          }
          System.out.println("reversed String is string:");
          System.out.println( );
	}

}
