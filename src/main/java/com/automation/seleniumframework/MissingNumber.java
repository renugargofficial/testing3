package com.automation.seleniumframework;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[5];
		int sum=0;
		Scanner scan=new Scanner(System.in);
		
		for(int i=0;i<=a.length-1;i++) {
			System.out.println("enter thr value of a");
			 a[i]=scan.nextInt();
			 sum=sum+a[i];
		}
		System.out.println("enter the value of n");
		int n=scan.nextInt();
		int Totalsum=n*(n+1)/2;
		System.out.println(n);
		int missiingno=0;
		missiingno=Totalsum-sum;
		System.out.println(missiingno);
	}
}
