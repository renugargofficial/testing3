package com.automation.seleniumframework;

import java.util.Arrays;
import java.util.Scanner;

public class arrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=new int[5];
//		int[]b=new int[5];
		int temp=0;

		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the values");
			a[i]=scan.nextInt();
		}
//
////		for(int j=0;j<=b.length-1;j++) {
////			b[j]=a[a.length-1-j];
////		
////		}
//		int l=0;
//		for(int k=a.length-1;k>=0;k--) {
//			b[l]=a[k];
//			l++;
//			
//		}
		
		
		//Revere by using variables:
		int g=0;
//		for (int m = a.length - 1; g < m; m--) {
		for (int m = a.length - 1; m>g;m--) {
//		for(int m=a.length-1;m>g;m--)
		temp=a[g];//20,30
		
		a[g]=a[m];
	    a[m]=temp;
	    g++;

		}

		System.out.println(Arrays.toString(a));
	}

}
