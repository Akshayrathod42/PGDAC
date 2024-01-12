package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo3 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\CDAC\\Desktop\\selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
	//	Thread.sleep(5000);
	//	d.manage().window().minimize();
	//	d.get("https://www.google.com/");
//		WebDriver d1=new ChromeDriver();
//		d1.get("https://www.gmail.com/");
		
	//	Thread.sleep(5000);
//		d.manage().window().maximize();
	//	d.close();
		
//		
//		String dr = d.getTitle();
//		System.out.println(dr);
//		
//		String title="Google";
//		if (dr.equals(title))
//		{
//			System.out.println("passed");
//		}
//		else
//		{
//			System.out.println("failed");
//		}
//		
//		String url = d.getCurrentUrl();
//		System.out.println(url);
//		String gp = d.getPageSource();
//		System.out.println(gp);
		
		
		//navigate method( <- or ->)
//		d.get("https://www.google.com/");
//		d.get("https://www.instagram.com/accounts/login/");
//		Thread.sleep(10000);
//		d.navigate().back();
//		Thread.sleep(10000);
//		d.navigate().forward();
//		Thread.sleep(5000);
//		d.navigate().refresh();
//		Thread.sleep(5000);
//		d.navigate().to("https://www.facebook.com/login/");
//		Thread.sleep(3000);
//		String str="https://demo.guru99.com/";
	//	d.get(str);
//		d.get("https://demo.guru99.com/v4/");
//		d.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
//		d.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("admin123");
//		d.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
////		
// d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("mngr547085");
// d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("UpAgYta");
// d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
//		
//		d.findElement(By.linkText("here")).click();
		d.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		d.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
		d.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("admin123");
		d.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
		
		
	}

}
