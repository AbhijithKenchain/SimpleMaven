package com.sampleMaven.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParaJenkins {
	public WebDriver driver;
	@Test
	public void paras()
	{
		
		ChromeOptions co=new ChromeOptions();
		co.setBrowserVersion("115");
		String Browser=System.getProperty("Browser");
		if (Browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (Browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else {
			System.out.println("invalid browser");
		}
		
	
		System.out.println("-------------open Browser------------");
		
		String Url=System.getProperty("Url");
		if (Browser.equalsIgnoreCase("chrome")) {
			driver.get("https://www.google.com");
		} else if (Browser.equalsIgnoreCase("edge")) {
			driver.get("https://www.facebook.com");
		} else {
			System.out.println("invalid browser");
		}
	}
	}


