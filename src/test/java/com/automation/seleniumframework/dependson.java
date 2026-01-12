package com.automation.seleniumframework;

import org.testng.annotations.Test;

public class dependson {
	
	@Test()
	public static void test() {
		System.out.println("test");
	}
	@Test(dependsOnMethods={"name"})
	public static void test34 () {
		System.out.println("test");
	}
	@Test()
	public static void name() {
		System.out.println("name");
	}
}
