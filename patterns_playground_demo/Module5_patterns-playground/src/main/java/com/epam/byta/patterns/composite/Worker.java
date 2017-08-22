package com.epam.byta.patterns.composite;

public class Worker implements Employee {
	private String name;
	private int happiness;

	public Worker(String name, int happiness) {
		this.name = name;
		this.happiness = happiness;
	}

	public void showHappiness() {
		System.out.println(name + " showed happiness level of " + happiness);
	}
}
