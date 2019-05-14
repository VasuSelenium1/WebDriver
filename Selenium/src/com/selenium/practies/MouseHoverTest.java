package com.selenium.practies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverTest
{
	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.navigate().to("Http://amazon.in");
		driver.manage().window().maximize();
		
		WebElement shop=driver.findElement(By.xpath(".//*[@id='nav-link-shopall']"));
		WebElement apv=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[4]/span"));
		WebElement all=driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[3]/div[4]/a[1]/span[1]"));
		Actions mouse=new Actions(driver);
		/*mouse.moveToElement(shop).build().perform();
		mouse.moveToElement(apv).build().perform();
		mouse.moveToElement(all).click().build().perform();*/
		mouse.moveToElement(shop).moveToElement(apv).pause(2000).moveToElement(all).click().build().perform();

	}

}
