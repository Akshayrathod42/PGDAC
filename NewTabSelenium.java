package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabSelenium {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
	    Thread.sleep(1000);
		
		d.get("https://www.facebook.com");
		String fw=d.getWindowHandle();
		d.switchTo().newWindow(WindowType.TAB);
	    Thread.sleep(1000);
		
		
		
		d.get("https://www.flipkart.com");
		d.switchTo().newWindow(WindowType.TAB);
	    Thread.sleep(1000);
		
		
		d.get("https://www.myntra.com/");
    	d.switchTo().window(fw);
        Thread.sleep(1000);
    	d.close();
    	d.quit();
    	
    	
		
}
	}



