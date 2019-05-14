package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://Google.co.in");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("gb_d")).click();
		
		System.out.println("Title of the page : "+driver.getTitle());
		System.out.println("URL of the page : "+driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("Title of the page : "+driver.getTitle());
		System.out.println("URL of the page : "+driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.close();

	}

}
