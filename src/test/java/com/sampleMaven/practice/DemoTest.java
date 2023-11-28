package com.sampleMaven.practice;

import org.testng.annotations.Test;

public class DemoTest  {
	
	
	@Test(groups= {"smoke","regression"})
	public void demo1()
	{
		System.out.println("--------demo 1----------");
	}

	@Test(groups="regression")
	public void demo2()
	{
		System.out.println("--------demo 2----------");
	}
}
