package org.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupingTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
	}
	
	@Test(groups="title")
	public void googletitleTest()
	{
		String title=driver.getTitle();
		System.out.println("the title of google page " +title);
	}
	
	
	
	@Test(groups="GoogleText")
	public void EnterText()
	{
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("youtube");;
		
	}
	
	@Test(groups="same")
	public void f1()
	{
		System.out.println("F1");
	}
	@Test(groups="same")
	public void f2()
	{
		System.out.println("F2");
	}
	@Test(groups="same")
	public void f3()
	{
		System.out.println("F3");
	}
	
	
	@AfterTest
	public void quitmethod()
	{
		driver.quit();
	}

}
