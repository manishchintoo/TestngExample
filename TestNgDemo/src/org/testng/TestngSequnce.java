package org.testng;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestngSequnce {
	
	
  @Test
  public void f1() {
	  
	  System.out.println("F1 METHOD");
  }
  
  public void f2()
  {
	  System.out.println("F2 method ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method get executed");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method get executed");
  }

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("Before class  get executed");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("After class get executed");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("Before test get executed");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("After test get executed");
  }

  @BeforeSuite
  public void beforeSuite() {
	  
	  System.out.println("Before suite get executed");
  }

  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("After suit method get executed");
  }

}
