package com.qa.PoshMark.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
	
	
	WebDriver driver;
	Properties prop;
	
	
	
	/**
	 * initializing driver 
	 * @return 
	 */
public WebDriver boot_Up_driver(String browserName) {
	if (browserName.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	else if (browserName.equals("FireFox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	else if (browserName.equals("opera")) {
		WebDriverManager.operadriver().setup();
		driver = new OperaDriver();
	}
	else {
		System.out.println("browser is not set up properly " + browserName);
	}
	driver.manage().window().fullscreen();
//	driver.manage().window().setPosition(new Point(700,100));
//	Point point = driver.manage().window().getPosition();
//			System.out.println(point);
	
	driver.get("https://poshmark.com/");
	
	return driver;
	
	
	
}


public Properties boot_Up_prop() {
	
	prop = new Properties();
	try {
		FileInputStream input = new FileInputStream("/Users/jey/eclipse-workspace/ECommercePoshMark/src/"
				+ "main/java/com/qa/PoshMark/Config/config.properties");
		prop.load(input);
		
	} catch (FileNotFoundException e) 
	{
		System.out.println("config file is missing please check it then correct it....");
	} catch (IOException e) {
	System.out.println("prop input couldnt load ");
		e.printStackTrace();
	}	
	
	return prop;
	
	
}
	








	
}
