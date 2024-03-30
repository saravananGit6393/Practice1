package com.test.eastepdefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.test.eabaseclass.EABaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends EABaseClass {
	
	@Before
	public void befforeScenario() throws FileNotFoundException, IOException {
		
		browserLaunch(getPropertyFileValue("browserName"));
		maximizeWindow();
		implicitWait(10);
		getUrl(getPropertyFileValue("url"));
		
	}
	
	@After
	public void afterScenario(Scenario scenario) throws InterruptedException {
		
		if (!scenario.isFailed()) {
			Thread.sleep(3000);
			scenario.attach(screenShotCucumber(), "image/png", "Contact Us Failed Scenario");
			
		}
		
	quitBorwser();
	}

}
