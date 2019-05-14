package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Selenium");
		driver.findElement(By.id("pass")).sendKeys("Selenium");
		driver.findElement(By.id("loginbutton")).click();
System.out.println("Done");
	}

}
