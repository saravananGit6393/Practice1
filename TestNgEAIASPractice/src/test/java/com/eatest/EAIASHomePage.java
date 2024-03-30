package com.eatest;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EAIASHomePage extends EAIASBaseClass{

	public EAIASHomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(xpath="//font[text()='Contact us'][1]")
	private WebElement lnkContactUs;
	
	@CacheLookup
	@FindBy(xpath="//h3[text()='Contact Us']")
	private WebElement txtContactUs;
	
	@CacheLookup
	@FindBy(xpath="//input[@class='wpcf7-form-control wpcf7-text'][@placeholder]")
	private WebElement txtboxTitle;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='your-name']")
	private WebElement txtboxName;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='company-name']")
	private WebElement txtboxCompanyName;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='Job-Title']")
	private WebElement txtboxJobTitle;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='country']")
	private WebElement txtboxCountry;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='phone_no']")
	private WebElement txtboxPhno;

	@CacheLookup
	@FindBy(xpath="//input[@class='wpcf7-form-control has-spinner wpcf7-submit']")
	private WebElement btnSend;

	public WebElement getLnkContactUs() {
		return lnkContactUs;
	}

	public WebElement getTxtContactUs() {
		return txtContactUs;
	}

	public WebElement getTxtboxTitle() {
		return txtboxTitle;
	}

	public WebElement getTxtboxName() {
		return txtboxName;
	}

	public WebElement getTxtboxCompanyName() {
		return txtboxCompanyName;
	}

	public WebElement getTxtboxJobTitle() {
		return txtboxJobTitle;
	}

	public WebElement getTxtboxCountry() {
		return txtboxCountry;
	}

	public WebElement getTxtboxPhno() {
		return txtboxPhno;
	}
	
	public WebElement getBtnSend() {
		return btnSend;
	}
	
	public void contactUsBusinessLogics(String title, String name, String compName, String jobTitle, String country, String pnNo) {
		
		implicitWait(10);
		click(getLnkContactUs());
		String lnkText = getText(getTxtContactUs());
		Assert.assertEquals("Verify that the page navigated to Contact us page",lnkText, "Contact Us");
		implicitWait(10);
		sendKeys(getTxtboxTitle(), title);
		sendKeys(getTxtboxName(), name);
		sendKeys(getTxtboxCompanyName(), compName);
		sendKeys(getTxtboxJobTitle(), jobTitle);
		sendKeys(getTxtboxCountry(), country);
		sendKeys(getTxtboxPhno(), pnNo);
		implicitWait(10);
		
		if (getBtnSend().isEnabled()) {
			
			click(getBtnSend());
			System.out.println("Contact us coloumn is working fine");
			
		} else {

			System.out.println("Contact us coloumn is working fine");
		
		}
	}
	
	
	
	
	
	
	
	
	

}
