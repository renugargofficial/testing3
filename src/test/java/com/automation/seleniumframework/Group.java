package com.automation.seleniumframework;

import org.testng.annotations.Test;

public class Group {
	@Test(groups= {"smoke"},enabled=true)
	public void testGroup() {
		System.out.println("group case executed");
	}
}
