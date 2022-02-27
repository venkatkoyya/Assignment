package com.sky.assignment.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;



public class DealsPage extends BasePage{
	
	
	public DealsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//*[text()='The streaming TV from Sky']")
	@CacheLookup
	WebElement header;
	
	@FindBy(xpath = "//*[@id=\"deals-filter\"]/button[1]")
	@CacheLookup
	WebElement lnk_deals;
	
	@FindBy(xpath = "//*[@id=\"price.offer.blt842c920bfe4270ca\"]")
	@CacheLookup
	WebElement lbl_dealOnePrice;
	
	@FindBy(xpath = "//*[@id=\"price.offer.blt8bd7cfb7bb3cf993\"]")
	@CacheLookup
	WebElement lbl_dealTwoPrice;
	
	@FindBy(xpath = "//*[@id=\"price.offer.blt6fd199dca4c4855d\"]")
	@CacheLookup
	WebElement lbl_dealThreePrice;
	
	@FindBy(xpath = "//*[text()='Sky Q, Sky TV & Netflix']")
	@CacheLookup
	WebElement lbl_dealOne;
	
	@FindBy(xpath = "//*[text()='Sky Q, Sky TV & Sky Sports']")
	@CacheLookup
	WebElement lbl_dealTwo;
	
	@FindBy(xpath = "//*[text()='Sky Q, Sky TV, Netflix & Sky Sports']")
	@CacheLookup
	WebElement lbl_dealThree;

	public void verifyPg()
	{
		header.isDisplayed();
	}
	
	public void clickOnTV()
	{
		lnk_deals.click();
	}
	
	public void VerifyDeals()
	{
		lbl_dealOne.isDisplayed();
		lbl_dealTwo.isDisplayed();
		lbl_dealThree.isDisplayed();
		Assert.assertEquals(lbl_dealOnePrice.getText().substring(5), "£26");
		Assert.assertEquals(lbl_dealTwoPrice.getText().substring(5), "£41");
		Assert.assertEquals(lbl_dealThreePrice.getText().substring(5), "£46");
	}

}
