package com.qa.PoshMark.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qa.PoshMark.Utility.Flat_static;
import com.qa.PoshMark.Utility.UtilityElementPoshMark;




public class EntryPage {

	Properties prop;
	WebDriver driver;
	UtilityElementPoshMark elementUtil;

	/**
	 *  defining my object repo 
	 */

	By logo = By.xpath("//a//img[@class='header__logo']");
	By login = By.xpath("//a[text()='Log in']");


	/**
	 * Starting Constructor 
	 */


	public EntryPage (WebDriver driver ) {
		this.driver = driver;
		//creating utility object by constructor level and passing driver
		elementUtil = new UtilityElementPoshMark(driver);
		prop = new Properties();
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


	public boolean getEntryPageLogo() {

		//	WebElement frameElement = driver.findElement(By.xpath("//*[@id=\"ssIFrame_google\"]"));
			
		
		driver.switchTo().frame("ssIFrame_google");
        return elementUtil.isElementDisplayed(logo);
		
	
//		String logotext = elementUtil.doGetText(logo);
//		System.out.println("logo text is :" +logotext);
//		return logotext;

	}

	public LoginPage clickLoginButton() {
		elementUtil.doClick(login);

		return new LoginPage();

	}






































}
