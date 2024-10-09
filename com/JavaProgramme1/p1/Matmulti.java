package com.JavaProgramme1.p1;
import java.util.*;

public class Matmulti {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] m1;
		int[][] m2;
		int[][] res;
		int size;
		Scanner sc=new Scanner(System.in);
		System.out.println("eneter size:");
		size=sc.nextInt();
		m1=new int[size][size];
		m2=new int[size][size];
		res=new int[size][size];
		System.out.println("enter value for m1:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("+++++++++++++++");
		System.out.println("enter value for m2:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		System.out.println("+++++++++++++++");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				for(int k=0;k<size;k++) {
					res[i][j]=res[i][j]+(m1[i][k]*m2[k][j]);
				}
			}
		}
		System.out.println("+++++++++++++++");
		System.out.println("the resut is:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
