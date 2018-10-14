package org.testng;

import org.testng.annotations.Test;

public class ExceptionTimeout {
	
	@Test(timeOut=2000)
	public void infiniteloop()
	{
		int i =1;
		
		while(i==1)
		{
			System.out.println("infinite loop " +1);
		}
		
	}
	
	@Test(expectedExceptions=NumberFormatException.class)
	public void NumberFormat()
	

	{
		String str = "this is number format exception";
		Integer.parseInt(str);
	}

}
