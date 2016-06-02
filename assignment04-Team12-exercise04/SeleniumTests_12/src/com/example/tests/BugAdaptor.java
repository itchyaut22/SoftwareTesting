package com.example.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.example.tests.pageobjects.BugzillaHomePage;
import com.example.tests.pageobjects.BugzillaShowBugPage;
import com.example.tests.pageobjects.BugzillaShowBugPage.State;

public class BugAdaptor {

	private static final String BASE_URL = "https://landfill.bugzilla.org/bugzilla-4.4-branch/";
	
	private BugzillaShowBugPage bugPage;
	
	public BugAdaptor(WebDriver driver) {
		driver.get(BASE_URL);
		
		BugzillaHomePage home = PageFactory.initElements(driver, BugzillaHomePage.class);
		if(!home.isSomeoneLoggedIn())
			home.login("mrtsjolder@gmail.com", "test123");
		
		this.bugPage = BugAdaptor.createBug(home);
	}
	
	public BugAdaptor(BugzillaHomePage home) {
		if(!home.isSomeoneLoggedIn())
			home.login("mrtsjolder@gmail.com", "test123");
		
		this.bugPage = BugAdaptor.createBug(home);
	}
	
	public String getState() {
		return bugPage.getState().split(" ")[0];
	}
	
	public void reset() {
		this.bugPage = BugAdaptor.createBug(this.bugPage.goToHomepage());
	}
	
	public void confirmBug() {
		bugPage = bugPage.selectState(State.NEW);
	}
	
	public void changeOwnerShip() {
		bugPage = bugPage.selectState(State.NEW);
	}
	
	public void takePossession() {
		bugPage = bugPage.selectState(State.ASSIGNED);
	}
	
	public void finishBug() {
		bugPage = bugPage.selectState(State.RESOLVED);
	}
	
	public void resolveIssue() {
		bugPage = bugPage.selectState(State.RESOLVED);
	}
	
	public void reportDissatisfyingSolution() {
		bugPage = bugPage.selectState(State.REOPENED);
	}
	
	public void reopenBug() {
		bugPage = bugPage.selectState(State.REOPENED);
	}
	
	public void verifySolution() {
		bugPage = bugPage.selectState(State.VERIFIED);
	}
	
	public void closeBug() {
		bugPage = bugPage.selectState(State.CLOSED);
	}
	
	public void reportUnconfirmedBug() {
		bugPage = bugPage.selectState(State.UNCONFIRMED);
	}
	
	private static BugzillaShowBugPage createBug(BugzillaHomePage home) {
		return home.clickFileABug().clickClassificationAll().clickProduct("FoodReplicator").
				enterBug("VoiceInterface", "the voice interface complains about a bug", "bad things happen");
	}

}
