package com.JavaProgramme1.p1;
class launch{
	 int add(int a,int b) {
    	 return a+b;
     }
     int add(int a,int b,int c) {
    	 return a+b+c;
     }
     float add(float a, float b) {
    	 return a+b;
     }
     float add(float a,float b,float c) {
    	 return a+b+c;
     }
     double add(double a,double b) {
    	 return a+b;
     }
     double add(double a,double b,double c) {
    	 return a+b+c;
     }
     float add(int a,float b) {
    	 return a+b;
     }
     float add(float a,int b) {
    	 return a+b;
     }
     double add(int a,float b,double c) {
    	 return a+b+c;
     }
	}
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch l=new launch();
		System.out.println(l.add(10, 2));
		System.out.println(l.add(12.7f, 2.3f));
		System.out.println(l.add(234.456,456.897));
   }
}
