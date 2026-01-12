package com.automation.seleniumframework;

import java.util.Arrays;

public class asecendingOrderSort {

	public static void main(String[] args) {
		int [] n= {2,5,1,3,4};
		int temp=0;
		for(int i=0;i<=n.length-1;i++) {
			for(int j=i+1;j<=n.length-1;j++) {
				if(n[i]>n[j]) {
					temp=n[i];
					n[i]=n[j];
					n[j]=temp;
				
				}
			}
		}
		System.out.println(Arrays.toString(n));
	}

}
