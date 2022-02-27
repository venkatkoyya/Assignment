package com.sky.assignment.qa.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage{
	
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[text()='Let’s get started']")
	@CacheLookup
	WebElement header;
	
	@FindBy(xpath = "//input[@id='username']")
	@CacheLookup
	WebElement inp_username;

	@FindBy(xpath="//*[text()='Continue']")
	WebElement btn_continue;
	
	@FindBy(xpath="//h1[text()='Create your My Sky password']")
	WebElement lbl_createYour;
	
	public void verifyPg()
	{
		header.isDisplayed();
	}
	
	public void enterUserName()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/main/div/div/div/div/iframe")));
		inp_username.sendKeys("kv3thrinadh@outlook.com");
	
	}
	
	public void clickContinue()
	{
		btn_continue.click();
	}
	
	public boolean verifyCreateYourPassword()
	{
		return lbl_createYour.isDisplayed();
	}

}
