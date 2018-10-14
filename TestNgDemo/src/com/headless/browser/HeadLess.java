package com.headless.browser;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HeadLess {

	WebDriver driver;
	
	@Test
	public void setup()
	{
		driver = new HtmlUnitDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("youtube");
		
	}
}
