package com.epam.DesignPatterns.BehaviouralPattern;

public class TVStartState implements State {
	@Override
	public void doAction() {
		System.out.println("TV is turned ON");
	}
}
