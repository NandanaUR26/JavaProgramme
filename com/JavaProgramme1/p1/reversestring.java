package com.JavaProgramme1.p1;
import java.util.*;
class reversestring{
	public static void main(String args[]) {
		System.out.println("enter the strig to reverse:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int spc=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' && str.charAt(i+1)!=' ') {
				spc++;
			}
		}
		System.out.println("word count is:"+(spc+1));
		int word_count=spc+1;
		String[] arr=new String[word_count];
		int temp=arr.length-1;
		String s="";
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
				s=s+str.charAt(i);
			}else {
				arr[temp]=s;
				temp--;
				s="";
			}
		}
		arr[temp]=s;
		System.out.println("the reversed array is:");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}