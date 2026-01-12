package com.automation.seleniumframework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotations {
	@Test
	public void testCase1() {
		System.out.println("test1");
	}
	
	@BeforeSuite
	public void suiterun1() {
		System.out.println("suiterun"+1);
	}
	
	@BeforeMethod
	public void method1() {
		System.out.println("before method run");
	}
	
	
	@Test(groups= {"smoke"})
	public void testGroup1() {
		System.out.println("group case 1executed");
	}

}
