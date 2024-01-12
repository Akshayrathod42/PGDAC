package com.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://demo.automationtesting.in/Alerts.html");
		WebElement we = d.findElement(By.xpath("//*[@id=\"OKTab\"]/button"));
		we.click();
		Thread.sleep(1000);
		Alert a = d.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
		
		
		
		
		
		

	}

}

//public class SeleniumAlert {
//
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\CDAC\\Desktop\\SeleniumFile\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
//
//		WebDriver obj = new ChromeDriver();
//		obj.manage().window().maximize();
//
//		obj.get("https://demo.automationtesting.in/Alerts.html");
//
//		WebElement we4 = obj.findElement(By.xpath("//button[contains(text(),'alert box:')]"));
//		we4.click();
//		Thread.sleep(5000);
//		Alert a = obj.switchTo().alert();
//		System.out.println(a.getText());
//		a.accept();
//
////		WebElement we5 = obj.findElement(By.xpath("//button[contains(text(),'click the button to display a confirm box')]"));
////		we5.click();
////		Alert a1 = obj.switchTo().alert();
////		System.out.println(a1.getText());
////		a1.accept();
////		
////		
////		WebElement we6 = obj.findElement(By.xpath("//button[contains(text(),'click the button to demonstrate the prompt box')]"));
////		we6.click();
////		Alert a2 = obj.switchTo().alert();
////		System.out.println(a2.getText());
////		a2.accept();
//
//
//
//	}
