package com.mihira.domain;

public enum SiteType {
	DESKTOP("desktop web"),
	MOBILE("mobile web"),
	ANDROID("android"),
	IOS("iOS");

	private final String name;
	
	SiteType(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * This function returns desired SiteType enum that matches input value.
	 * Note that the values for DESKTOP and MOBILE will have the underline removed before matching.
	 * @param value
	 * @return
	 * @throws IllegalArgumentException case the value doesn't match any SiteType
	 */
	public static SiteType valueFromString(String value) {
		value = value.replace('_',' ');
		for(SiteType siteType : SiteType.values()) {
			final String siteName = siteType.getName();
			if (siteName.equalsIgnoreCase(value)) {
				return siteType;
			}
		}
		throw new IllegalArgumentException();
	}
}
