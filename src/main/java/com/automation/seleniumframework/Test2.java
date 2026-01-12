package com.automation.seleniumframework;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Test2 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Dimension dim=driver.manage().window().getSize();
	Dimension ndim=new Dimension(dim.width/2,dim.height/2);
	driver.manage().window().setSize(ndim);
	
//	
//			Element t1=driver.findElement(By.id("CardInstancebOCGOi1FRob_DT7LuvBL0Q"));
//	t1.click();
	}
}
