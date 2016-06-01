package com.example.tests;

import com.example.tests.pageobjects.BugzillaShowBugPage;
import com.example.tests.pageobjects.BugzillaShowBugPage.State;

public class BugAdaptor {
	
	private BugzillaShowBugPage bugPage;
	
	public BugAdaptor(BugzillaShowBugPage bug) {
		this.bugPage = bug;
	}
	
	public String getState() {
		return bugPage.getState().split(" ")[0];
	}
	
	public void reset() {
		// TODO: should there be a new bug for every run? Current solution crashes when NEW is not an option.
		bugPage.selectState(State.NEW);
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

}
