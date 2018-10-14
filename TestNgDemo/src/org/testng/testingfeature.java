package org.testng;

import org.testng.annotations.Test;

public class testingfeature {
	
	@Test
	public void login()
	{
		
		System.out.println("Login page");
		int i =9/0;
		System.out.println("Number Format exception" +i);
	}
	@Test(dependsOnMethods="login")
	public void homepage()
	{
		System.out.println("Home page ");
	}

}
