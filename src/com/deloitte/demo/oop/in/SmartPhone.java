package com.deloitte.demo.oop.in;

public class SmartPhone extends FeaturePhone {

	public void camera() {
		System.out.println("Clicking pics...");
	}

	@Override
	public void music() {
		System.out.println("Playing Dolby DTS music...");
	}

}
