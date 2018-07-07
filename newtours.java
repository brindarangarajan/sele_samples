package com.org.webdriversample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class newtours {
	public static void main(String[] args)
	{

		System.setProperty("webdriver.gecko.driver","G:\\geckodriver-v0.20.1-win32\\geckodriver.exe");
		WebDriver ff = new FirefoxDriver();
		
		ff.get("http://newtours.demoaut.com/");
		ff.findElement(By.name("userName")).sendKeys("abc");
		ff.findElement(By.name("password")).sendKeys("abc");
		
		ff.findElement(By.name("login")).click();
		//ff.findElement(By.linkText("registration form")).click();
		ff.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/a")).click();
		
		ff.findElement(By.name("firstName")).sendKeys("Brinda");
		ff.findElement(By.name("lastName")).sendKeys("Rangarajan");
		ff.findElement(By.name("phone")).sendKeys("9176602683");
		ff.findElement(By.name("userName")).sendKeys("brinda.rangarajan@gmail.com");
		
		ff.findElement(By.name("address1")).sendKeys("No 4/51, Nagoji Rao Street");
		ff.findElement(By.name("city")).sendKeys("Chennai");
		ff.findElement(By.name("state")).sendKeys("TamilNadu");
		ff.findElement(By.name("postalCode")).sendKeys("600005");
		
		Select s = new Select(ff.findElement(By.name("country")));
		//s.selectByVisibleText("INDIA");
		s.selectByValue("92");
		
		ff.findElement(By.name("email")).sendKeys("vijay123");
		ff.findElement(By.name("password")).sendKeys("abc");
		ff.findElement(By.name("confirmPassword")).sendKeys("abc");
		
		ff.findElement(By.name("register")).click();
		System.out.println(ff.getTitle());
		System.out.println(ff.getCurrentUrl());
		System.out.println(ff.getPageSource());
	
		
	}
}
