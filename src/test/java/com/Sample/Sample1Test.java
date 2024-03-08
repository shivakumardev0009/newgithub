package com.Sample;

import org.testng.annotations.Test;

public class Sample1Test 
{
	@Test(groups = "smoke")
	public void testScript5()
	{
		System.out.println("----test Script 05-----");
	}
	@Test(groups = {"smoke","regression"})
	public void testScript6()
	{
		System.out.println("----test Script 06-----");
	}

}
