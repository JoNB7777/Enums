package com.qa.enumeration;

public enum Day {
	MONDAY("Football"),
	TUESDAY("No hope"),
	WEDNESDAY("Desperate"),
	THURSDAY("Happy"),
	FRIDAY("End of Week"),
	SATURDAY("Relaxed"),
	SUNDAY("Bored");
	
	private String feeling;
	
	Day(String feeling) {
		this.setFeeling(feeling);
	}

	public String getFeeling() {
		return feeling;
	}

	public void setFeeling(String feeling) {
		this.feeling = feeling;
	}
	
}
