package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo6 {
			public static void main(String[] args) throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
				WebDriver d = new ChromeDriver();
				d.manage().window().maximize();
				d.get("https://demo.guru99.com/v4/index.php");
				WebElement we=d.findElement(By.xpath("https://demo.guru99.com/v4/index.php"));
	            we.sendKeys("");
	            we.clear();
	            we.click();
	            
	            
	            String v=we.getAttribute("value");
	            System.out.println(v);
	            d.findElement(By.xpath(v));
	            String s=we.getText();
	            System.out.println(s);
	         
	            
			
			
			
			
			}

}
