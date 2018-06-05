package com.mihira.domain;

public enum SiteType {
	DESKTOP("desktop web"),
	MOBILE("mobile  web"),
	ANDROID("android"),
	IOS("iOS");

	private final String name;
	
	SiteType(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
