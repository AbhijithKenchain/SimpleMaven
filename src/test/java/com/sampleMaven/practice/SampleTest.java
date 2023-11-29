package com.sampleMaven.practice;

import org.testng.annotations.Test;

public class SampleTest{


		
		
		@Test(groups="smoke")
		public void sample1()
		{
			System.out.println("--------sample 1----------");
			System.out.println("=======smoke=========");
		}

		@Test(groups="regression")
		public void sample2()
		{
			System.out.println("--------sample 2----------");
			System.out.println("=======regression=========");
		}
	}


