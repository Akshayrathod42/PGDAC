package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumDemo2 {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CDAC\\Desktop\\selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		
	}

}
