package com.JavaProgramme1.p1;

class SampleCode {
	static int a,b,c;
	int p,q,r;
	static 
	{ 
		System.out.println("static block");
		a=1;
		b=2;
		c=3;
			}
	{
		a=10;
		b=20;
		c=30;
		p=1001;
		q=2001;
		r=3001;
	}
	static void display() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
				
	}
	void display1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(p);
		System.out.println(q);
		System.out.println(r);			
	}
	
}
public class StaticProgramExample {
	public static void main(String args[]) {
		System.out.println("Main method");
		SampleCode.display();
		System.out.println("------------");
		SampleCode.a=111;
		SampleCode.b=222;
		SampleCode.c=333;
		SampleCode.display();
		System.out.println("------------");
		SampleCode sc=new SampleCode();
		sc.display1();
		System.out.println("------------");
		sc.display();// we can also use objects to call static methods
		
		
	}
}
