package com.mihira.domain;

public enum Month {
	JANUARY("January"),
	FEBRUARY("February"),
	MARCH("March"),
	APRIL("April"),
	MAY("May"),
	JUNE("June"),
	JULY("July"),
	AUGUST("August"),
	SEPTEMBER("September"),
	OCTOBER("October"),
	NOVEMBER("November"),
	DECEMBER("December");

	private final String name;
	
	Month(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	/**
	 * Function that returns equivalent Month enum for the integer value.
	 * Ex.: 1 returns JANUARY, 2 returns FEBRUARY, ... 12 returns DECEMBER
	 * @param value
	 * @return
	 * @throws IllegalArgumentException case integer is not in 1-12 range
	 */
	public static Month valueFromInteger(int value) {
		if (value > 0 && value <= 12) {
			return Month.values()[value -1];
		}
		throw new IllegalArgumentException();
	}

	/**
	 * Function that matches either the full month name or their first three letters and 
	 * returns the equivalent Month enum. The strings are matched ignoring case.
	 * @param value
	 * @return
	 * @throws IllegalArgumentException in case of invalid month input
	 */
	public static Month valueFromString(String value) {
		for(Month month : Month.values()) {
			final String monthName = month.getName();
			if (monthName.equalsIgnoreCase(value)
					|| monthName.substring(0, 3).equalsIgnoreCase(value)) {
				return month;
			}
		}
		throw new IllegalArgumentException();
	}
}
