package com.sky.assignment.qa.stepdefs;


import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.sky.assignment.qa.pages.BasePage;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends BasePage{

	public Logger logger;
	
	@Before
	public void setup()
	{
		logger = Logger.getLogger("EmployeeRestAPI");
		PropertyConfigurator.configure("Log4j.properties");
		logger.setLevel(Level.DEBUG);
		initialize();
	}
	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}

}
