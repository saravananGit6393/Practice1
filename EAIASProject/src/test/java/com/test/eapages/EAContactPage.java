package com.test.eapages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.test.eabaseclass.EABaseClass;

public class EAContactPage extends EABaseClass{
	
	public  EAContactPage() {
		
    PageFactory.initElements(driver, this);

	}
	
	@CacheLookup
	@FindBy(xpath="(//font[text()='Contact us'])[1]")
	private WebElement lnkContactUs;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='title']")
	private WebElement txtboxTitle;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='your-name']")
	private WebElement txtboxName;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='company-name']")
	private WebElement txtboxCompName;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='Job-Title']")
	private WebElement txtboxJobTitle;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='country']")
	private WebElement txtboxCountry;
	
	@CacheLookup
	@FindBy(xpath="//input[@name='phone_no']")
	private WebElement txtboxPhNo;
	
	@CacheLookup
	@FindBy(xpath="//input[@class='wpcf7-form-control has-spinner wpcf7-submit']")
	private WebElement btnSend;
	
	
	@CacheLookup
	@FindBy(xpath="//h3[text()='Contact Us']")
	private WebElement txtContactUs;
	

	public WebElement getTxtContactUs() {
		return txtContactUs;
	}

	public WebElement getLnkContactUs() {
		return lnkContactUs;
	}

	public WebElement getTxtboxTitle() {
		return txtboxTitle;
	}

	public WebElement getTxtboxName() {
		return txtboxName;
	}

	public WebElement getTxtboxCompName() {
		return txtboxCompName;
	}

	public WebElement getTxtboxJobTitle() {
		return txtboxJobTitle;
	}

	public WebElement getTxtboxCountry() {
		return txtboxCountry;
	}

	public WebElement getTxtboxPhNo() {
		return txtboxPhNo;
	}

	public WebElement getBtnSend() {
		return btnSend;
	}
	
	
	public void homePageBusinessLogics() {
		
		click(getLnkContactUs());
		implicitWait(10);
		
	}
	
	public void verifyContactUsPageBusinessLogics() {
		
		implicitWait(10);
		String text = getText(getTxtContactUs());
		Assert.assertEquals("Verify the ContactUs Page success Msg", text, "Contact Us");
		
	}
	
	public void contactUsPageFieldEnterBusinessLogics(String title, String name, String compName,String jobTitle, String country, String phNo) {
		
		implicitWait(10);
		sendKeys(getTxtboxTitle(), title);
		sendKeys(getTxtboxName(), name);
		sendKeys(getTxtboxCompName(), compName);
		sendKeys(getTxtboxJobTitle(), jobTitle);
		sendKeys(getTxtboxCountry(), country);
		sendKeys(getTxtboxPhNo(), phNo);
		implicitWait(10);
		
	}
	
	public void VerifyAfterEnterSendBusinessLogics(String successMsg, String failedMsg) {
		
		
		implicitWait(10);
		
		
		if (getBtnSend().isEnabled()) {
			
			click(getBtnSend());
			System.out.println("Contact Us Coloumn Is Working Fine");
			
		} else {

			System.out.println("Contact Us Coloumn Is Not Working");
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
