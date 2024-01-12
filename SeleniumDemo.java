package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.driver",
				"C:\\Users\\CDAC\\Desktop\\SE_AK\\geckodriver-v0.34.0-win32\\geckodriver.exe");
		WebDriver d = new FirefoxDriver();
		d.get("https://www.instagram.com/accounts/login/");
		
		
	}

}
