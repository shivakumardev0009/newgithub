package com.Demo;

import org.testng.annotations.Test;

public class Demo1Test 
{
	@Test(groups = "smoke")
	public void testScript1()
	{
		System.out.println("----test Script 01-----");
	}
	@Test(groups = "regression")
	public void testScript2()
	{
		System.out.println("----test Script 02-----");
	}
}
