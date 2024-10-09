package com.JavaProgramme1.p1;
import java.util.*;
public class Spacecount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String str=sc.nextLine();
int spc=0;
for(int i=0;i<str.length();i++) {
	if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
		spc++;
	}
	}
   if(str.charAt(0)==' ') {
System.out.println("word count is:"+(spc));
	}else {
		System.out.println("word count is:"+(spc+1));
	}

}
}