package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumTextNg {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		Thread.sleep(1000);
//		d.get("https://demo.guru99.com/v4/");
//		WebElement we=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/a"));
//		Thread.sleep(1000);
//		we.click();
//		WebElement we1=d.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul/li[1]/ul/li[2]/a"));
//		Thread.sleep(1000);
//		we1.click();
		d.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement dg = d.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dp = d.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions act = new Actions(d);
		act.dragAndDrop(dg, dp).build().perform();
		
		Thread.sleep(1000);
		
		WebElement dg1 = d.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dp1 = d.findElement(By.xpath("//*[@id=\"bank\"]"));
		Actions act1 = new Actions(d);
		act.dragAndDrop(dg1, dp1).build().perform();
		Thread.sleep(1000);
		
		
		WebElement dg2 = d.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement dp2 = d.findElement(By.xpath("//*[@id=\"loan\"]"));
		Actions act2 = new Actions(d);
		act.dragAndDrop(dg2, dp2).build().perform();
		
		WebElement dg3 = d.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dp3 = d.findElement(By.xpath("//*[@id=\"amt8\"]"));
		Actions act3 = new Actions(d);
		act.dragAndDrop(dg3, dp3
				).build().perform();
		

	}
}