package com.JavaProgramme1.p1;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String s1=new String("sita");
        String s2=new String("Ravana");
        s1.concat(s2);
        s1=s1.concat(s2);
        System.out.println(s1);
        
        StringBuffer sb1=new StringBuffer("Nan");
        StringBuffer sb2=new StringBuffer("dana");
        sb1.append(sb2);
        System.out.println(sb1);
        
        StringBuilder sbl1=new StringBuilder("Sita");
        StringBuilder sbl2=new StringBuilder("Rama");
        sbl1.append(sbl2);
        System.out.println(sbl1);
        
	}

}
