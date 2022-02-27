package com.sky.assignment.qa.stepdefs;


import org.testng.Assert;

import com.sky.assignment.qa.pages.DealsPage;
import com.sky.assignment.qa.pages.HomePage;
import com.sky.assignment.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class DealsPage_Srepdef{

	HomePage homePg;
	DealsPage dealsPg;
	LoginPage loginPg;
	
	@Given("I am on the ‘https:\\/\\/www.sky.com\\/deals‘ page")
	public void navigate_to_deals_page() {
		homePg = new HomePage();
		homePg.clickDeals();
		
		dealsPg = new DealsPage();
		dealsPg.clickOnTV();
	}

	@Then("I see a list of deals with a price")
	public void Verify_list_of_deals_with_a_price() {

		dealsPg.VerifyDeals();
	}
	
	@When("I try to sign in with invalid credentials")
	public void enterInvalid_credentials() {
		homePg = new HomePage();
		loginPg = homePg.clickLogin();
		loginPg.enterUserName();
		loginPg.clickContinue();
		

	}

	@Then("I should see a box with the text ‘Create your My Sky password’")
	public void the_text_create_your_my_sky_password() {
		Assert.assertTrue(loginPg.verifyCreateYourPassword());

	}

}
