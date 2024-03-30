package com.test.eatestrunner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.test.eabaseclass.EABaseClass;
import com.test.eatestreport.JvmReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@Scenario1",snippets=SnippetType.CAMELCASE,dryRun=false,monochrome=true,stepNotifications=true,plugin= {"pretty","json:target\\contactus.json"},features="src\\test\\resources",glue="com.test.eastepdefinition")

public class TestRunner extends EABaseClass{
	
	@AfterClass
	public static void afterClassMehod() throws FileNotFoundException, IOException {
		
		JvmReport.generateJVMReport(getProjectPath()+getPropertyFileValue("jsonPath"));
		
	}

}
