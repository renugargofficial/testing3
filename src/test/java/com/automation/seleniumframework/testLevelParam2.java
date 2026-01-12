package com.automation.seleniumframework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testLevelParam2 
{	
	@Parameters({"test"})
@Test()
public static void test245(String name) {
	System.out.println("test21"+name);
}
	@Parameters({"test"})
@Test()
public static void test2456(String name) {
	System.out.println("test22"+name);
}
}



