package com.Demo;

import org.testng.annotations.Test;

public class Demo2Test {
	@Test(groups = "smoke")
	public void testScript7()
	{
		System.out.println("----test Script 07-----");
	}
	@Test(groups = "regression")
	public void testScript8()
	{
		System.out.println("----test Script 08-----");
	}

}
