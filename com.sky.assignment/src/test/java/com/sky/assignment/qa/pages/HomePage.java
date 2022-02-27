package com.sky.assignment.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends BasePage{
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[text()='The streaming TV from Sky']")
	@CacheLookup
	WebElement header;
	
	@FindBy(linkText = "Deals")
	@CacheLookup
	WebElement lnk_deals;

	@FindBy(linkText = "Sign in")
	WebElement lnk_login;
	
	@FindBy(id = "masthead-search-toggle")
	WebElement btn_search;
	
	@FindBy(xpath = "//*[@id=\"masthead-navigation\"]/div/div[1]/div[2]/div/div/div/div/div/div/div/input")
	WebElement int_search;
	
	@FindBy(xpath = "//*[text()='Unlock the UK’s widest range of Ultra HD entertainment with Sky Q and multiscreen. Take a look at our best broadband deals and discover our range of Mobile phones and data plans.']")
	WebElement lbl_editorial;
	
	public void verifyPg()
	{
		header.isDisplayed();
	}
	
	public void clickDeals()
	{
		lnk_deals.click();
	}
	
	public LoginPage clickLogin()
	{
		lnk_login.click();
		return new LoginPage();
	}
	
	public void clickSearch()
	{
		btn_search.click();
	}
	
	public void enterText() throws InterruptedException
	{
		int_search.sendKeys("sky");
		Thread.sleep(5000);
	}
	
	public void verifyEditorial()
	{
		lbl_editorial.isDisplayed();
	}
	
}
