package com.example.tests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugzillaSelectClassificationPage {

	private final WebDriver driver;

	@FindBy(linkText = "All")
	private WebElement all;

	public BugzillaSelectClassificationPage(WebDriver driver) {
		this.driver = driver;

		if (!"Select Classification".equals(driver.getTitle()))
			throw new IllegalStateException("This is not the classification selection page of bugzilla");
	}

	public BugzillaSelectProductPage clickClassificationAll() {
		all.click();
		return PageFactory.initElements(driver, BugzillaSelectProductPage.class);
	}

}
