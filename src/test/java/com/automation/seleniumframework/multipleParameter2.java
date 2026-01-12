package com.automation.seleniumframework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multipleParameter2 {
//		@Parameters("name,name1")
		@Test(dataProvider="getData")
		public static void test1(String name, String test) {
			System.out.println(name);
			System.out.println(test);

		}
		@DataProvider
		public Object getData() {
		Object[][]data=new Object[2][2];
		data[0][0]= "renu345";
		data[0][1]= "renu356";
		data[1][0]= "renu567";
		data[1][1]= "renu1678";
		return data;
		}
		
		
}
