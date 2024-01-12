package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo5 {

	public class SeleniumDemo4 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\selenium Data\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.get("https://demo.automationtesting.in/Register.html");
			d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys("akshay");
			Thread.sleep(3000);
			d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys("rathod");
			Thread.sleep(3000);
			d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("pune");
			Thread.sleep(3000);
			d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("akshayrathod4242@gmail.com");
			Thread.sleep(3000);
			d.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9767070597");
			d.findElement(By.name("radiooptions")).click();
			d.findElement(By.id("checkbox1")).click();
//			d.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[1]")).click();
//			d.findElement(By.xpath("//body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[7]/div[1]/multi-select[1]/div[1]/div[1]")).click();
			Select city=new Select(d.findElement(By.xpath("//*[@id=\"Skills\"]")));
			city.selectByIndex(4);
			Thread.sleep(3000);
			Select skill=new Select(d.findElement(By.xpath("//*[@id=\"Skills\"]")));
			skill.selectByVisibleText("1995");
			
			Select year=new Select(d.findElement(By.xpath("//*[@id=\"yearbox\"]")));
			year.selectByVisibleText("1995");
			Thread.sleep(3000);
			Select month=new Select(d.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select")));
			month.selectByVisibleText("December");
			Thread.sleep(3000);
			Select day=new Select(d.findElement(By.xpath("//*[@id=\"daybox\"]")));
			day.selectByVisibleText("4");
			
			
			
		}
	}
}