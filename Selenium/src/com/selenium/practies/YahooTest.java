package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooTest {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vasu\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("Http://yahoo.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("uh-search-box")).sendKeys("Selenium");
		driver.findElement(By.id("uh-search-button")).click();

	}

}
