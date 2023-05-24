package com.in28minutes.oops.level2;

public class Fan extends FanRunner {
	// state
	private String make;
	private double radius;
	private String color;
	
	private boolean isOn;
	private byte speed; // 0 to 5
	
	// creation
	public Fan(String make, double radius, String color) {
		this.make = make;
		this.radius = radius;
		this.color = color;
	}
	
	// isOn
	public void switchOn() {
		this.isOn = true;
	}
	
	public void switchOff() {
		this.isOn = false;
		setSpped((byte)0);
	}
	
	// speed
	public void setSpped(byte speed) {
		this.speed = speed;
	}
	
	// print the state
	public String toString() {
		return String.format("make - %s, raidus - %f, color - %s, isOn - %b, speed - %d",
				make, radius, color, isOn, speed);
		
	}

}
