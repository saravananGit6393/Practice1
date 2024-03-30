package com.eatest;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.*;

public class EAIASAppTest extends EAIASBaseClass{
	
	@BeforeClass
	private void beforeClassAnnotationMethod() throws FileNotFoundException, IOException {
		browserLaunch(getPropertyFileValue("browserName"));
		maximizeWindow();
		implicitWait(10);
		getUrl(getProjectPath()+getPropertyFileValue("url"));
		
	}
	
	@AfterClass
	private void afterClassAnnottionMethod() {
		implicitWait(10);
		closeWindow();
		
	}
	
	@BeforeMethod
	private void beforeAnnotationMothed() throws FileNotFoundException, IOException {
		
		implicitWait(10);
	    long currentTimeMillis = System.currentTimeMillis();
	    System.out.println(currentTimeMillis);
	    
	    takeScreenshot(getProjectPath()+getPropertyFileValue("screenshot"));
		
		
	}
	
	@AfterMethod
	private void afterAnnotationMethod() throws FileNotFoundException, IOException {
		
		implicitWait(10);
		long currentTimeMillis = System.currentTimeMillis();
	    System.out.println(currentTimeMillis);
	    
	    takeScreenshot(getProjectPath()+getPropertyFileValue("screenshot"));
		
	}
	
	@Test
	private void EAIASAppContactUsModuleTest() {
		
		implicitWait(10);
		EAIASHomePage eaIasHomePage = new EAIASHomePage();
		eaIasHomePage.contactUsBusinessLogics("Mr", "ABC", "IASEAS", "Tester", "India", "9876543210");
	}

}
