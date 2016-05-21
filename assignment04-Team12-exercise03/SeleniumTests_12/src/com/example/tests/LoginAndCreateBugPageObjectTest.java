package com.example.tests;

import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.example.tests.pageobjects.BugzillaHomePage;
import com.example.tests.pageobjects.BugzillaNewBugPage;
import com.example.tests.pageobjects.BugzillaSelectClassificationPage;
import com.example.tests.pageobjects.BugzillaSelectProductPage;
import com.example.tests.pageobjects.BugzillaShowBugPage;

public class LoginAndCreateBugPageObjectTest {
	
  private WebDriver driver;
  private String baseUrl;

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://landfill.bugzilla.org/bugzilla-4.4-branch/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);
  }

  @Test
  public void testLogin() throws Exception {
    BugzillaHomePage page0 = PageFactory.initElements(driver, BugzillaHomePage.class);
    assertFalse(page0.isSomeoneLoggedIn());
    
    String userName = "mrtsjolder@gmail.com";
    String password = "test123";
    page0 = page0.login(userName, password);
    assertTrue(page0.isLoggedIn(userName));
  }
  
  @Test
  public void testCreateBug() throws Exception {
    BugzillaHomePage page0 = PageFactory.initElements(driver, BugzillaHomePage.class);
    assertFalse(page0.isSomeoneLoggedIn());
    
    String userName = "mrtsjolder@gmail.com";
    String password = "test123";
    page0 = page0.login(userName, password);
    
    BugzillaSelectClassificationPage page1 = page0.clickFileABug();
    BugzillaSelectProductPage page2 = page1.clickClassificationAll();
    BugzillaNewBugPage page3 = page2.clickProductMyOwnBadSelf();
    
    String componentName = "comp2";
    String summary = "The wool of this sheep prevents my browser from loading";
    String description = "I was playing around a bit with myownbadself and chrome did not want to start anymore";
    BugzillaShowBugPage page4 = page3.enterBug(componentName, summary, description);
    
    assertEquals(summary, page4.getSummary());
    assertEquals(description, page4.getDescription());
    assertTrue(page4.isNewBug());
  }
  
  @Test
  public void testCreateBugWithoutSummary() {
	BugzillaHomePage page0 = PageFactory.initElements(driver, BugzillaHomePage.class);
	assertFalse(page0.isSomeoneLoggedIn());
	
	String userName = "mrtsjolder@gmail.com";
	String password = "test123";
	page0 = page0.login(userName, password);
	
	BugzillaSelectClassificationPage page1 = page0.clickFileABug();
	BugzillaSelectProductPage page2 = page1.clickClassificationAll();
	BugzillaNewBugPage page3 = page2.clickProductMyOwnBadSelf();
	
	String componentName = "comp2";
	String description = "Very bad idea";
	page3.selectComponent(componentName);
	page3.writeDescription(description);
	page3.clickSubmitButtonExpectFailure();

	assertEquals(description, page3.getDescription());
	assertEquals("", page3.getSummary());
	assertTrue(page3.isNoSummaryWarningShown());
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
  }
}
