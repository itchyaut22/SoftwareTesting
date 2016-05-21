package com.example.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BugzillaNewBugPage {

	private final WebDriver driver;
	
	@FindBy(id = "component")
	private WebElement component;
	@FindBy(id = "rep_platform")
	private WebElement platform;
	@FindBy(id = "short_desc")
	private WebElement summary;
	@FindBy(id = "comment")
	private WebElement description;
	@FindBy(id = "commit")
	private WebElement submitButton;
	
	public BugzillaNewBugPage(WebDriver driver) throws IllegalStateException {
		this.driver = driver;
		
		if (!driver.getTitle().startsWith("Enter Bug: "))
			throw new IllegalStateException("This is not a bug creation page");
	}
	
	public String getDescription() {
		return description.getAttribute("value");
	}
	
	public String getSummary() {
		return summary.getAttribute("value");
	}
	
	public boolean isNoSummaryWarningShown() {
		return driver.findElement(By.cssSelector("div.validation_error_text")).isDisplayed();
	}
	
	public BugzillaNewBugPage selectComponent(String componentName) {
		new Select(component).selectByVisibleText(componentName);
		return this;
	}
	
	public BugzillaNewBugPage selectPlatform(String platformName) {
		new Select(platform).selectByVisibleText(platformName);
		return this;
	}
	
	public BugzillaNewBugPage writeSummary(String summary) {
		this.summary.clear();
		this.summary.sendKeys(summary);
		return this;
	}
	
	public BugzillaNewBugPage writeDescription(String description) {
		this.description.clear();
		this.description.sendKeys(description);
		return this;
	}
	
	public BugzillaShowBugPage clickSubmitButton() {
		submitButton.click();
		return PageFactory.initElements(driver, BugzillaShowBugPage.class);
	}

	public BugzillaNewBugPage clickSubmitButtonExpectFailure() {
		submitButton.click();
		return this;
	}
	
	public BugzillaShowBugPage enterBug(String componentName, String summary, String description) {
		selectComponent(componentName);
		writeSummary(summary);
		writeDescription(description);
		return clickSubmitButton();
	}
}
