package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BugzillaTest {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://landfill.bugzilla.org/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testBugzilla() throws Exception {
		// Pfoser/Mayer/Hoedt - Team 12 - part A
		driver.get(baseUrl + "bugzilla-4.4-branch/");
		assertTrue(isElementPresent(By.id("login_link_top")));
		driver.findElement(By.id("login_link_top")).click();
		driver.findElement(By.id("Bugzilla_login_top")).clear();
		driver.findElement(By.id("Bugzilla_login_top")).sendKeys("mrtsjolder@gmail.com");
		driver.findElement(By.id("Bugzilla_password_top")).clear();
		driver.findElement(By.id("Bugzilla_password_top")).sendKeys("test123");
		driver.findElement(By.id("log_in_top")).click();
		assertEquals("| Log out mrtsjolder@gmail.com",
				driver.findElement(By.xpath("//div[@id='header']/ul/li[9]")).getText());
		driver.findElement(By.id("enter_bug")).click();
		driver.findElement(By.linkText("All")).click();
		driver.findElement(By.linkText("MyOwnBadSelf")).click();
		new Select(driver.findElement(By.id("component"))).selectByVisibleText("comp2");
		driver.findElement(By.id("short_desc")).clear();
		driver.findElement(By.id("short_desc")).sendKeys("The wool of this sheep prevents my browser from loading");
		driver.findElement(By.id("comment")).clear();
		driver.findElement(By.id("comment"))
				.sendKeys("I was playing around a bit with myownbadself and chrome did not want to start anymore");
		driver.findElement(By.id("commit")).click();
		assertEquals("I was playing around a bit with myownbadself and chrome did not want to start anymore",
				driver.findElement(By.id("comment_text_0")).getText());
		assertEquals("The wool of this sheep prevents my browser from loading",
				driver.findElement(By.id("short_desc_nonedit_display")).getText());
		assertEquals("NEW (edit)", driver.findElement(By.id("static_bug_status")).getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}
