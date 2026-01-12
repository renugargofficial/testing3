package com.automation.seleniumframework;

import java.util.Scanner;

public class Array1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int [] a=new int[5];
		for(int i=0;i<a.length;i++) {
			System.out.println("Enter the value of n");
			a[i]=scan.nextInt();
		}
		System.out.println("a"+a[2]);
		//10,20,40,20,60
		int max=a[0];
		for( int j=0;j<a.length;j++) {
			if(max<a[j]) {
				max=a[j];
			}
		}
		System.out.println(max);
		System.out.println(a[a.length-1]);
	}
}
