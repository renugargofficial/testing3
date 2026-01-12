package com.automation.seleniumframework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param2 {
	@Parameters({"URL"})
	@Test()
	public void testparam3(String URL) {
		System.out.println("class test param3"+URL);
	}
	@Parameters({"URL"})
	@Test()
	public void testparam4(String URL) {
		System.out.println("class test param4"+URL);
	}
}

