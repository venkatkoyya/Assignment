package com.sky.assignment.qa.stepdefs;


import org.testng.Assert;

import com.sky.assignment.qa.pages.HomePage;
import com.sky.assignment.qa.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class HomePage_Srepdef{

	HomePage homePg;
	LoginPage loginPg;
	
	@Given("^I am on the home page$")
	public void navigateToHomePage() throws Throwable {
	    homePg = new HomePage();
	    homePg.verifyPg();
	}

	@When("^I navigate to ‘Deals’$")
	public void tapOnDeals() throws Throwable {
		homePg.clickDeals();
	}

	@Then("^the user should be on the \\\"([^\\\"]*)\\\"$")
	public void navigateToDeealsPage(String url) throws Throwable {
		
		 Assert.assertEquals(url,homePg.getUrl());
		 
	}
	
	@When("I search ‘sky’ in the search bar")
	public void i_search_sky_in_the_search_bar() throws InterruptedException {
			homePg.clickSearch();
			homePg.enterText();
	}

	@Then("I should see an editorial section.")
	public void i_should_see_an_editorial_section() {
		homePg.verifyEditorial();
	}

}
