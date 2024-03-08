package com.Practice;

import org.testng.annotations.Test;

public class Practice1Test 
{
	@Test(groups = "regression")
	public void testScript3()
	{
		System.out.println("----test Script 03-----");
	}
	@Test(groups = {"smoke","regression"})
	public void testScript2()
	{
		System.out.println("----test Script 04-----");
	}

}
