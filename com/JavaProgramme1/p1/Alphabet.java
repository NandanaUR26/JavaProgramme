package com.JavaProgramme1.p1;

import java.util.Scanner;

public class Alphabet {
	public static void main(String[] rags) {
	System.out.println("enter word-1");
	Scanner sc=new Scanner(System.in);
    String s1=sc.next();
    for(int i=0;i<s1.length();i++) {
    if(s1.charAt(i)>='a' && s1.charAt(i)<='z') {
    	System.out.println("the string is panagram");
    	System.exit(0);
    }else {
    	System.out.println("string is not a panagram");
    	System.exit(0);
    }
}
}
}
