package com.example.tests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugzillaInvalidLoginPage {
	
	private final WebDriver driver;
	
	@FindBy(linkText = "Home")
	private WebElement home;
	
	public BugzillaInvalidLoginPage(WebDriver driver) throws IllegalStateException {
		this.driver = driver;
		
		if (!driver.getTitle().equals("Invalid Username Or Password"))
			throw new IllegalStateException("This is not the invalid log in page");
	}
	
	public BugzillaHomePage goToHomePage() {
		home.click();
		return PageFactory.initElements(driver, BugzillaHomePage.class);
	}
}
