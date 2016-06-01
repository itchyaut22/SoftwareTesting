package com.example.tests;

import org.junit.Assert;
import nz.ac.waikato.modeljunit.Action;

public class BugLifecycleModelWithAdaptor extends BugLifecycleModel {
    
    protected BugAdaptor sut;
    
    public BugLifecycleModelWithAdaptor(BugAdaptor sut) throws NullPointerException {
    	if(sut == null)
    		throw new NullPointerException();
    	
    	this.sut = sut;
    }

	@Override
	public void reset(boolean testing) {
		super.reset(testing);
		sut.reset();
	}
	
	@Action
	public void confirmBug() {
		super.confirmBug();
		sut.confirmBug();
		checkSUT();
	}
	
	@Action
	public void changeOwnership() {
		super.changeOwnership();
		sut.changeOwnerShip();
		checkSUT();
	}
	
	@Action
	public void takePossession() {
		super.takePossession();
		sut.takePossession();
		checkSUT();
	}
	
	@Action
	public void finishBug() {
		super.finishBug();
		sut.finishBug();
		checkSUT();
	}
	
	@Action
	public void resolveIssue() {
		super.resolveIssue();
		sut.resolveIssue();
		checkSUT();
	}
	
	@Action
	public void reportDissatisfyingSolution() {
		super.reportDissatisfyingSolution();
		sut.reportDissatisfyingSolution();
		checkSUT();
	}
	
	@Action
	public void reopenBug() {
		super.reopenBug();
		sut.reopenBug();
		checkSUT();
	}
	
	@Action
	public void verifySolution() {
		super.verifySolution();
		sut.verifySolution();
		checkSUT();
	}
	
	@Action
	public void closeBug() {
		super.closeBug();
		sut.closeBug();
		checkSUT();
	}
	
	@Action
	public void reportUnconfirmedBug() {
		super.reportUnconfirmedBug();
		sut.reportUnconfirmedBug();
		checkSUT();
	}
	
	protected void checkSUT() {
		Assert.assertEquals(state.toString(), sut.getState());
	}

}
