package com.JavaProgramme1.p1;
import java.util.*;
class Matrix{
	int mat1[][];
	int mat2[][];
	int res[][];
	int size;
	Scanner sc=new Scanner(System.in);
	void createMatrix() {
		System.out.println("enter the size of matrix:");
		size=sc.nextInt();
		mat1=new int[size][size];
		System.out.println("Matrix-1 created");
		mat2=new int[size][size];
		System.out.println("Matrix-1 created");
		System.out.println("++++++++++++++++");
	}
	void collectDataOfM1() {
		System.out.println("eneter value of M1:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				mat1[i][j]=sc.nextInt();
			}
		}
		System.out.println("M1 data collected");
		System.out.println("++++++++++++++++++++");
	}
	void collectDataOfM2() {
		System.out.println("enter value of M2:");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				mat2[i][j]=sc.nextInt();
			}
		}
		System.out.println("M2 data Collected");
		System.out.println("+++++++++++++++++++++");
	}
	 void addition() {
		 System.out.println("adding two matrices:");
		 res=new int[size][size];
		 for(int i=0;i<size;i++) {
			 for(int j=0;j<size;j++) {
				 res[i][j]=mat1[i][j]+mat2[i][j];
			 }
		 }
		 
		 System.out.println("additon done:");
		 System.out.println("+++++++++++++++++++");
	 }
	 void display() {
		 System.out.println("the resultant matrix is");
		 for(int i=0;i<size;i++) {
			 for(int j=0;j<size;j++) {
				 System.out.print(res[i][j]+" ");
			 }
			 System.out.println();
		 }
	 }
}
public class MatrixOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Matrix mo=new Matrix();
          mo.createMatrix();
          mo.collectDataOfM1();
          mo.collectDataOfM2();
          mo.addition();
          mo.display();
	}
	
	

}
