package com.automation.seleniumframework;

import java.util.Scanner;

public class secondLargest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] a=new int[6];
		int index1=0;
		int index2=0;
		for(int i=0;i<a.length;i++) {
			System.out.println("enter the value of a"+i);
			a[i]=scan.nextInt();
		}
		int max1=a[0];
		int max2=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max1) {
				System.out.println(i);
				max2=max1;
				max1=a[i];
				index2=index1;
				index1=i;
			}
			
			if(a[i]<max1&&a[i]>max2) {
				System.out.println("max2"+i);
				max2=a[i];
				index2=i;
				}
			
			}
		
		System.out.println("finalmax1"+max1+"at"+index1);
		System.out.println("finalmax2"+max2+"at"+index2);
	}

}
