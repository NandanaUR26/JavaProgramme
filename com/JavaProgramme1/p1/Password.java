package com.JavaProgramme1.p1;
import java.util.*;
public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the password:");
        String str=sc.nextLine();
        for(int i=0;i<str.length();i++) {
        	if((str.charAt(i)=='a' && str.charAt(i)<='z')|| (str.charAt(i)=='A' && str.charAt(i)<='Z') ) {
        		System.out.println("contains one capital and small letters");
        	}
        	else if((str.charAt(i)=='0' && str.charAt(i)<='9')) {
        		System.out.println("contains one number");
        	}
        	else if(())
        	}
        
        
	}

}
