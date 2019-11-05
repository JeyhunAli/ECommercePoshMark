package com.qa.PoshMark.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.PoshMark.Utility.Flat_static;
import com.qa.PoshMark.Utility.UtilityElementPoshMark;




public class EntryPage {
	
	
	WebDriver driver;
	UtilityElementPoshMark elementUtil;
	
	/**
	 *  defining my object repo 
	 */
	
	By logo = By.cssSelector("#app > header > nav > div > a > img");
	By login = By.xpath("//a[text()='Log in']");
	
	
	/**
	 * Starting Constructor 
	 */
	
	
	public EntryPage (WebDriver driver ) {
		this.driver = driver;
		//creating utility object by constructor level and passing driver
		elementUtil = new UtilityElementPoshMark(driver);
	}
	
	
	/**
	 * Now starting Page Actions here 
	 * @return 
	 * @return 
	 */
	
	public String getPageTitle() {
		String pageTitle = elementUtil.waitForTitlePresent(Flat_static.POSHMARK_MAIN_PAGE_TITLE, 15);
		System.out.println("main page title is: " +pageTitle);
		return pageTitle;
	}
	
	
	public String getEntryPageLogo() {
		elementUtil.waitForElementPresent(logo, 15);
String logotext = elementUtil.doGetText(logo);
System.out.println("logo text is :" +logotext);
return logotext;

	}
	
	public LoginPage clickLoginButton() {
		elementUtil.doClick(login);
		
		return new LoginPage();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
