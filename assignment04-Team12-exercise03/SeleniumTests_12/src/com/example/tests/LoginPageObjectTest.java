package com.example.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.example.tests.pageobjects.BugzillaHomePage;
import com.example.tests.pageobjects.BugzillaInvalidLoginPage;

public class LoginPageObjectTest {

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() {
		driver = new FirefoxDriver();
		baseUrl = "https://landfill.bugzilla.org/bugzilla-4.4-branch/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}

	@Test
	public void testSuccessLogin() {
		BugzillaHomePage page0 = PageFactory.initElements(driver, BugzillaHomePage.class);
		assertFalse(page0.isSomeoneLoggedIn());

		String userName = "mrtsjolder@gmail.com";
		String password = "test123";
		page0 = page0.login(userName, password);
		assertTrue(page0.isLoggedIn(userName));
	}

	@Test
	public void testFailedLogin() {
		BugzillaHomePage page0 = PageFactory.initElements(driver, BugzillaHomePage.class);
		assertFalse(page0.isSomeoneLoggedIn());

		String userName = "bla";
		String password = "bla";
		BugzillaInvalidLoginPage page1 = page0.loginExpectFailure(userName, password);
		page0 = page1.goToHomePage();
		assertFalse(page0.isLoggedIn(userName));
		assertFalse(page0.isSomeoneLoggedIn());
	}

	@After
	public void tearDown() {
		driver.quit();
	}
}