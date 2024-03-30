package com.test.eastepdefinition;

import com.test.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC1_EA_ContactPageStepDefinition {
	
	
	PageObjectManager pom = new PageObjectManager();
	
	@Given("User is on the homepage")
	public void userIsOnTheHomepage() {
	   
		pom.geteAContactPage().homePageBusinessLogics();
	
	}
	@When("User is on the contactus page")
	public void userIsOnTheContactusPage() {
	 
	pom.geteAContactPage().verifyContactUsPageBusinessLogics();
		
	}
	@When("User enters given input fields {string},{string},{string},{string},{string}, and {string}")
	public void userEntersGivenInputFieldsAnd(String title, String name, String compName, String jobTitle, String country, String phNo) {
	
	pom.geteAContactPage().contactUsPageFieldEnterBusinessLogics(title, name, compName, jobTitle, country, phNo);
		
	}
	@Then("User should verify success msg or failed msg after enter send {string} and {string}")
	public void userShouldVerifySuccessMsgOrFailedMsgAfterEnterSendAnd(String successMsg, String failedMsg) {
	
	pom.geteAContactPage().VerifyAfterEnterSendBusinessLogics(successMsg, failedMsg);
		
	}




}
