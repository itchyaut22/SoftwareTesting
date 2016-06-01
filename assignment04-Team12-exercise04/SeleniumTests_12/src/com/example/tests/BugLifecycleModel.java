package com.example.tests;

import nz.ac.waikato.modeljunit.Action;
import nz.ac.waikato.modeljunit.FsmModel;
import nz.ac.waikato.modeljunit.GreedyTester;
import nz.ac.waikato.modeljunit.Tester;
import nz.ac.waikato.modeljunit.VerboseListener;

public class BugLifecycleModel implements FsmModel {
    
    public enum State { NEW, ASSIGNED, RESOLVED, UNCONFIRMED, REOPENED, VERIFIED, CLOSED };
    
    protected State state = State.NEW;

	@Override
	public Object getState() {
		return state.toString();
	}

	@Override
	public void reset(boolean testing) {
		state = State.NEW;
	}
	
	@Action
	public void confirmBug() {
		state = State.NEW;
	}
	
	public boolean confirmBugGuard() {
		return state == State.UNCONFIRMED;
	}
	
	@Action
	public void changeOwnership() {
		state = State.NEW;
	}
	
	public boolean changeOwnershipGuard() {
		return state == State.ASSIGNED;
	}
	
	@Action
	public void takePossession() {
		state = State.ASSIGNED;
	}
	
	public boolean takePossessionGuard() {
		return state == State.NEW || state == State.UNCONFIRMED || state == State.REOPENED;
	}
	
	@Action
	public void finishBug() {
		state = State.RESOLVED;
	}
	
	public boolean finishBugGuard() {
		return state == State.ASSIGNED || state == State.NEW || state == State.UNCONFIRMED;
	}
	
	@Action
	public void resolveIssue() {
		state = State.RESOLVED;
	}
	
	public boolean resolveIssueGuard() {
		return state == State.REOPENED;
	}
	
	@Action
	public void reportDissatisfyingSolution() {
		state = State.REOPENED;
	}
	
	public boolean reportDissatisfyingSolutionGuard() {
		return state == State.RESOLVED;
	}
	
	@Action
	public void reopenBug() {
		state = State.REOPENED;
	}
	
	public boolean reopenBugGuard() {
		return state == State.VERIFIED || state == State.CLOSED;
	}
	
	@Action
	public void verifySolution() {
		state = State.VERIFIED;
	}
	
	public boolean verifySolutionGuard() {
		return state == State.RESOLVED;
	}
	
	@Action
	public void closeBug() {
		state = State.CLOSED;
	}
	
	public boolean closeBugGuard() {
		return state == State.VERIFIED || state == State.RESOLVED;
	}
	
	@Action
	public void reportUnconfirmedBug() {
		state = State.UNCONFIRMED;
	}
	
	public boolean reportUnconfirmedBugGuard() {
		return state == State.CLOSED;
	}
	
	public static void main(String[] args) {
	    Tester tester = new GreedyTester(new BugLifecycleModel());
	    tester.addListener(new VerboseListener());
	    tester.generate(1000);
    }

}
