package com.example.tests.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BugzillaHomePage {
	
	private final WebDriver driver;
	
	@FindBy(id = "login_link_top")
	private WebElement loginLink;
	@FindBy(id = "Bugzilla_login_top")
	private WebElement usernameField;
	@FindBy(id = "Bugzilla_password_top")
	private WebElement passwordField;
	@FindBy(id = "log_in_top")
	private WebElement loginButton;
	@FindBy(xpath = "//div[@id='header']/ul/li[9]")
	private WebElement logout;
	@FindBy(id = "enter_bug")
	private WebElement newBugButton;
	@FindBy(id = "quicksearch_main")
	private WebElement quickSearchEntry;
	@FindBy(id = "find")
	private WebElement quickSearchButton;
	
	public BugzillaHomePage(WebDriver driver) throws IllegalStateException {
		this.driver = driver;
		
		if (!driver.getTitle().equals("Bugzilla Main Page"))
			throw new IllegalStateException("This is not the main page of bugzilla");
	}
	
	public BugzillaHomePage clickLogin() {
		loginLink.click();
		return this;
	}
	
	public BugzillaHomePage typeUsername(String username) {
		usernameField.clear();
		usernameField.sendKeys(username);
		return this;
	}
	
	public BugzillaHomePage typePassword(String password) {
		passwordField.clear();
		passwordField.sendKeys(password);
		return this;
	}
	
	public BugzillaHomePage submitLogin() {
		loginButton.click();
		return this;
	}
	
	public BugzillaInvalidLoginPage submitLoginExpectFailure() {
		loginButton.click();
		return PageFactory.initElements(driver, BugzillaInvalidLoginPage.class);
	}
	
	public BugzillaShowBugPage quickSearch(int id) {
		quickSearchEntry.sendKeys(String.format("%d", id));
		quickSearchButton.click();
		return PageFactory.initElements(driver, BugzillaShowBugPage.class);
	}
	
	public BugzillaHomePage login(String username, String password) {
		clickLogin();
		typeUsername(username);
		typePassword(password);
		return submitLogin();
	}
	
	public BugzillaInvalidLoginPage loginExpectFailure(String username, String password) {
		clickLogin();
		typeUsername(username);
		typePassword(password);
		return submitLoginExpectFailure();
	}
	
	public boolean isLoggedIn(String username) {
		return logout.getText().equals("| Log out " + username);
	}
	
	public boolean isSomeoneLoggedIn() {
		try {
			driver.findElement(By.id("login_link_top"));
			return false;
		} catch(NoSuchElementException e) {
			return true;
		}
	}
	
	public BugzillaSelectClassificationPage clickFileABug() {
		newBugButton.click();
		return PageFactory.initElements(driver, BugzillaSelectClassificationPage.class);
	}

}
