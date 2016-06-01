package com.example.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugzillaSelectProductPage {
	
	private final WebDriver driver;
	
	@FindBy(linkText = "MyOwnBadSelf")
	private WebElement myOwnBadSelf;
	
	public BugzillaSelectProductPage(WebDriver driver) {
		this.driver = driver;
		
		if (!"Enter Bug".equals(driver.getTitle()))
			throw new IllegalStateException("This is not the product selection page of bugzilla");
	}
	
	public BugzillaNewBugPage clickProduct(String productName) {
		driver.findElement(By.linkText(productName)).click();
		return PageFactory.initElements(driver, BugzillaNewBugPage.class);
	}
	
	public BugzillaNewBugPage clickProductMyOwnBadSelf() {
		myOwnBadSelf.click();
		return PageFactory.initElements(driver, BugzillaNewBugPage.class);
	}
}
