package com.automation.seleniumframework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Param1 {
	@Parameters({"URL"})
	@Test()
	public void testparam(String URL) {
		System.out.println("suit test param1"+URL);
	}
	@Parameters({"URL"})
	@Test()
	public void testparam2(String URL) {
		System.out.println("suit test param2"+URL);
	}
}
