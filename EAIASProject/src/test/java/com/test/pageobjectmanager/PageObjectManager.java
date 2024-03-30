package com.test.pageobjectmanager;

import com.test.eapages.EAContactPage;

public class PageObjectManager {
	
	private EAContactPage eAContactPage;

	public EAContactPage geteAContactPage() {
		return (eAContactPage==null)? eAContactPage = new EAContactPage() :eAContactPage;
	}
	
	

}
