package com.automation.seleniumframework;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test24 {
	@Test()
	public void test1() {
		System.out.println("test 1 executed");
	}
	@Test()
	public void test2() {
		System.out.println("test 2 executed");
	}
	@BeforeTest()
	public void beforetest() {
		System.out.println("beforetestexecuted");
	}
	
	@AfterTest()
	public void test0() {
		System.out.println("TESTAfter");
	}
	
	@AfterSuite()
	public void suiterun1() {
		System.out.println("@AfterSuite"+12);
	}
	
	@AfterMethod()
	public void method12() {
		System.out.println("@Aftermethod"+12);

	}
	
	
}
