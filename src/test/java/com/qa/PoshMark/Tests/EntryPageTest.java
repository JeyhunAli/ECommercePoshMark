package com.qa.PoshMark.Tests;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.qa.PoshMark.Base.BasePage;
import com.qa.PoshMark.Pages.EntryPage;
import com.qa.PoshMark.Utility.Flat_static;

public class EntryPageTest {
	
	
	/**
	 * 
	 * here at the class level I'm defining all main class and interfaces 
	 */
	WebDriver driver;
	BasePage basepage;
	Properties prop;
	EntryPage entryPage;
	
	@BeforeMethod 
	public void setUp() {
		basepage = new BasePage();
		prop = basepage.boot_Up_prop();
		String browser = prop.getProperty("browser");
		driver= basepage.boot_Up_driver(browser);
		driver.get(prop.getProperty("url"));
		/**
		 *   creating object of entry page and passing constructor driver
		 */
		entryPage=new EntryPage(driver);
		
	}
	
	
	

	@Test(priority = 1)
	public void verifyEntryPageLogo() {
		Assert.assertEquals(entryPage.getEntryPageLogo(), Flat_static.POSHMARK_header_logo,"logo couldnot find");;
	}
	
	@Test(priority = 2)
	public void verifyMainPageTitle() {
		Assert.assertEquals(entryPage.getPageTitle(),Flat_static.POSHMARK_MAIN_PAGE_TITLE,"main page title is incorrect");
		
		
	}
	
	@Test(priority = 3)
	public void loginButtonTest() {
		entryPage.clickLoginButton();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void tearDown() {
	driver.quit();
		
	}

}



































