package com.JavaProgramme1.p1;
import java.util.*;
class StrOps{
	void countVowel(String s) {
		int vowel_count=0;
		int consonat_count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o'||
			s.charAt(i)=='u' || s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='I'||
			s.charAt(i)=='O' || s.charAt(i)=='U') {
				vowel_count++;
			}
			else {
				consonat_count++;
			}
		}
		System.out.println("vowel Count is:"+vowel_count);
		System.out.println("consonant Count is:"+consonat_count);
	}
	void capitalVowel(String s) {
		int capital_vowel_count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='u' || s.charAt(i)=='A'|| s.charAt(i)=='E' || s.charAt(i)=='I'||
			s.charAt(i)=='O' || s.charAt(i)=='U') {
				capital_vowel_count++;
			}
		}
		System.out.println("Capital vowel Count is:"+capital_vowel_count);
	}
	void smallVowel(String s) {
		int small_vowel_count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a' || s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o'||
			s.charAt(i)=='u') {
				small_vowel_count++;
			}
		}
		System.out.println("small vowel Count is:"+small_vowel_count);
	}
	
}
public class StrOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		StrOps st=new StrOps();
		System.out.println("enter the string:");	
      String str=sc.nextLine();
      st.countVowel(str);
      st.capitalVowel(str);
      st.smallVowel(str);
      System.out.println(str.length());
      
	}

}
