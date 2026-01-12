package com.automation.seleniumframework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multipleParameter1 {
	@Parameters({"name","name1"})
	@Test()
	public static void test1(String name, String test) {
		System.out.println(name);
		System.out.println(test);

	}
}
