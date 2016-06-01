package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.example.tests.pageobjects.BugzillaHomePage;
import com.example.tests.pageobjects.BugzillaShowBugPage;

import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;

public class BugLifecycleTest {
	
	private static final String BASE_URL = "https://landfill.bugzilla.org/bugzilla-4.4-branch/";
	private static final int BUG_ID = 28378;
	
	private WebDriver driver;
	private BugzillaShowBugPage bugPage;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(BASE_URL);
	    
	    BugzillaHomePage home = PageFactory.initElements(driver, BugzillaHomePage.class);
	    if(!home.isSomeoneLoggedIn())
	    	home.login("mrtsjolder@gmail.com", "test123");
	    
	    bugPage = home.quickSearch(BUG_ID);
	}

	@Test
	public void test() {
		BugAdaptor sut = new BugAdaptor(bugPage);
	    Tester tester = new GreedyTester(new BugLifecycleModelWithAdaptor(sut));
	    tester.addListener(new VerboseListener());
	    tester.generate(10);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
