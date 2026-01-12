package com.automation.seleniumframework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testLevelParam1 {
	@Parameters({"test"})
	@Test()
	public static void test45(String name) {
		System.out.println("test1"+name);
	}
	@Parameters({"test"})
	@Test()
	public static void test456(String name) {
		System.out.println("test2"+name);
	}
}
