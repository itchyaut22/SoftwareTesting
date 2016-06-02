package com.example.tests.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BugzillaShowBugPage {
	
	public enum State { NEW, ASSIGNED, RESOLVED, UNCONFIRMED, REOPENED, VERIFIED, CLOSED };
	
	private WebDriver driver;

	@FindBy(linkText = "Home")
	private WebElement homeLink;
	@FindBy(css = "b")
	private WebElement bugId;
	@FindBy(id = "short_desc_nonedit_display")
	private WebElement summary;
	@FindBy(id = "comment_text_0")
	private WebElement description;
	@FindBy(id = "static_bug_status")
	private WebElement staticStatus;
	@FindBy(id = "bug_status")
	private WebElement status;
	@FindBy(id = "commit")
	private WebElement saveStatusButton;
	@FindBy(id = "addselfcc")
	private WebElement addToCC;
	
	public BugzillaShowBugPage(WebDriver driver) throws IllegalStateException {
		this.driver = driver;
		
		if (!driver.getTitle().startsWith("Bug "))
			throw new IllegalStateException("This is not a bug overview page");
	}
	
	public int getId() {
		return Integer.parseInt(bugId.getText().replaceFirst("Bug ", ""));
	}
	
	public String getSummary() {
		return summary.getText();
	}
	
	public String getDescription() {
		return description.getText();
	}
	
	public boolean isNewBug() {
		return getState().equals("NEW");
	}

	public String getState() {
		return staticStatus.getText().replaceFirst(" (edit)", "");
	}
	
	public BugzillaShowBugPage selectState(State state) {
		// prevent spam
		if (addToCC.isSelected())
			addToCC.click();
		
		new Select(status).selectByVisibleText(state.toString());
		saveStatusButton.click();
		
		return this;
	}
	
	public BugzillaHomePage goToHomepage() {
		homeLink.click();
		return PageFactory.initElements(driver, BugzillaHomePage.class);
	}

}
