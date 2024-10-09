package com.JavaProgramme1.p1;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Byte b= new Byte((byte)123);
       System.out.println(b);
       Short s=new Short((short)30000);
       System.out.println(s);
       Integer i=new Integer(46000);
       System.out.println(i);
       Long l=new Long(23456789);
       System.out.println(l);
       
       Float f=new Float(234.567f);
       System.out.println(f);
       Double d=new Double(4567.45678);
       System.out.println(d);
       
       Character c=new Character('a');
       System.out.println(c);
       String st=new String("abs");
       System.out.println(st);
       
       Boolean bo=new Boolean(true);
       System.out.println(bo);
	}

}
