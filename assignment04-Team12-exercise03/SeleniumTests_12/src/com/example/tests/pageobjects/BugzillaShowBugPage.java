package com.example.tests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BugzillaShowBugPage {

	@FindBy(id = "short_desc_nonedit_display")
	private WebElement summary;
	@FindBy(id = "comment_text_0")
	private WebElement description;
	@FindBy(id = "static_bug_status")
	private WebElement status;

	public BugzillaShowBugPage(WebDriver driver) throws IllegalStateException {
		if (!driver.getTitle().startsWith("Bug "))
			throw new IllegalStateException("This is not a bug overview page");
	}

	public String getSummary() {
		return summary.getText();
	}

	public String getDescription() {
		return description.getText();
	}

	public boolean isNewBug() {
		return status.getText().startsWith("NEW");
	}
}
