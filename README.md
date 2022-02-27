# Assignment

#Project structure 
![Uploading Screenshot 2022-02-27 at 20.15.28.png…]()


## Concepts Included

* Shared state across cucumber step definitions
* Dependency injection
* Page Object pattern
* Common web page interaction methods
* Mavenised performance tests
* test configuration
* Commonly used test utility classes
* Simple tests

## Tools

* Maven
* Cucumber-JVM
* TestNg
* Selenium Webdriver
* log4j

## Requirements

In order to utilise this project you need to have the following installed locally:

* Maven 3
* Chrome and Chromedriver
* Java 1.8



## Usage

The project is broken into separate modules for API, UI, Performance and Security testing. Each of these modules can be utilised independently of the others using maven profiles.

To run all modules, navigate to `test-automation-quickstart` directory and run:

`mvn clean install`

## IDE used 
 Eclipse 
 - we have to isntall Testng and cucumber plugins before running the tests 


## Reporting

Reports for each module are written into their respective `/target` directories after a successful run.

target/cucumber-reports/advanced-reports

target/cucumber-reports/CucumberTestReport.json
![Uploading Screenshot 2022-02-27 at 20.16.35.png…]()


