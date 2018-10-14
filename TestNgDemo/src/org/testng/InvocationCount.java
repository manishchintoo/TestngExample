package org.testng;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test(invocationCount=10)
	public void Invocationcountmethod()
	
	{
		int x =10;
		int y =20;
		int z =x+y;
		System.out.println("the value of z is " + z);
	}

}
