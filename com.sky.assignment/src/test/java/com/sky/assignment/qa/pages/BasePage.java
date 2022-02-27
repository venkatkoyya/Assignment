package com.sky.assignment.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {

	public static WebDriver driver;
	public void initialize()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.sky.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement iframe = driver.findElement(By.id("sp_message_iframe_474555"));
		driver.switchTo().frame(iframe);
		driver.findElement(By.xpath("//button[text()='Agree']")).click();
		driver.switchTo().parentFrame();
		
	}
	
	public String getUrl()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver.getCurrentUrl();
	}
	
}
