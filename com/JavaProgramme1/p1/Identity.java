package com.JavaProgramme1.p1;
import java.util.*;
			
class Matrix2{
			int[][] m1;
			int size;
			Scanner sc=new Scanner(System.in);
			
			void createMatrix() 
			{
			System.out.println("eneter size:");
			size=sc.nextInt();
			m1=new int[size][size];
			System.out.println("++++++++++++++");
			}
			
			void collectData() {
			System.out.println("enter value for m1:");
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					m1[i][j]=sc.nextInt();
				}
			}
			}
			void checkIdentity() {
			System.out.println("+++++++++++++++");
			for(int i=0;i<size;i++) {
				for(int j=0;j<size;j++) {
					if(i==j) {
						if(m1[i][j]!=1) {
						System.out.println("The matrix is not an identity matrix");
						System.exit(0);
						}
					}else {
						if(m1[i][j]!=0) {
							System.out.println("The matrix is not an identity matrix");
							System.exit(0);
						}
					}
				}
			}
			System.out.println("the given matrix is identity matrix");
			}
			
			}
			public class Identity {
			    
				public static void main(String[] args) {
					Matrix2 m=new Matrix2();
					m.createMatrix();
					m.collectData();
					m.checkIdentity();
				}
		}

