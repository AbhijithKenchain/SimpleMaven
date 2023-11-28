package com.sampleMaven.practice;

import org.testng.annotations.Test;

public class PracticeTest {

	
	
		
		
		@Test(groups="smoke")
		public void practice1()
		{
			System.out.println("--------practice 1----------");
		}

		@Test(groups="regression")
		public void practice2()
		{
			System.out.println("--------practice 2----------");
		}
	}


