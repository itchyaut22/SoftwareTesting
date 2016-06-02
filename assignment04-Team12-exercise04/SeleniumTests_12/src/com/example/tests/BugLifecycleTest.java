package com.example.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;

public class BugLifecycleTest {
	
	private static final String BASE_URL = "https://landfill.bugzilla.org/bugzilla-4.4-branch/";
	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(BASE_URL);
	}

	@Test
	public void test() {
		BugAdaptor sut = new BugAdaptor(driver);
	    Tester tester = new GreedyTester(new BugLifecycleModelWithAdaptor(sut));
	    tester.addListener(new VerboseListener());
	    tester.generate(10);
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
}
