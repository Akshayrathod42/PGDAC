package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.saucedemo.com/");
		d.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(10000);
		d.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(10000);
		d.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("//*[@id=\"item_4_title_link\"]")).click();
		Thread.sleep(10000);
		d.navigate().back();

		d.findElement(By.xpath("//*[@id=\"react-burger-menu-btn\"]")).click();
		Thread.sleep(10000);
		d.findElement(By.xpath("//*[@id=\"logout_sidebar_link\"]")).click();
		Thread.sleep(10000);

	}

}
