package com.JavaProgramme1.p1;

import java.util.*;
	public class Array1{
		int ar[][][];
		Scanner sc=new Scanner(System.in);
		int uni;
		int cls;
		int stu;
		void createArray() {
			System.out.println("Array creation");
			System.out.println("enter the univarcity number:");
			uni=sc.nextInt();
			System.out.println("enter the class number:");
			cls=sc.nextInt();
			System.out.println("eneter student count:");
			stu=sc.nextInt();
			ar=new int[uni][cls][stu];
			System.out.println("array created");
			
		}
		void collectData() {
			System.out.println("collecting the student marks:");
			for(int i=0;i<uni;i++) {
				
				for(int j=0;j<cls;j++) {
					System.out.println("univercity number:"+i);
					System.out.println("class no:"+j);
					for(int k=0;k<stu;k++) {
						System.out.println("enter the marks of stu no:"+(k+1));
						ar[i][j][k]=sc.nextInt();
					}
					System.out.println("++++++++++++++++++++");
				}
				
			}
			System.out.println("+++++++++++++++");
		}
		 void display(){
			System.out.println("displaying stu data");
			for(int i=0;i<ar.length;i++) {
				
				for(int j=0;j<ar[i].length;j++) {
					System.out.println("univercity number:"+i);
					System.out.println("class number:"+j);
					for(int k=0;k<ar[i][j].length;k++) {
						System.out.println("enter the marks of stu number:"+(k+1));
					System.out.println("marks of stu number:"+(k+1)+"is="+ar[i][j][k]);
				}
					System.out.println("++++++++++++");	
				}
		}
	}
	}
