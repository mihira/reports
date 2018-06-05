package com.mihira.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonthTest {

	@Test(expected = IllegalArgumentException.class)
	public void testValueFromInteger_0() {
		Month.valueFromInteger(0);
	}

	@Test
	public void testValueFromInteger_1() {
		assertEquals(Month.JANUARY, Month.valueFromInteger(1));
	}

	@Test
	public void testValueFromInteger_2() {
		assertEquals(Month.FEBRUARY, Month.valueFromInteger(2));
	}
	
	@Test
	public void testValueFromInteger_3() {
		assertEquals(Month.MARCH, Month.valueFromInteger(3));
	}
	
	@Test
	public void testValueFromInteger_4() {
		assertEquals(Month.APRIL, Month.valueFromInteger(4));
	}

	@Test
	public void testValueFromInteger_5() {
		assertEquals(Month.MAY, Month.valueFromInteger(5));
	}
	
	@Test
	public void testValueFromInteger_6() {
		assertEquals(Month.JUNE, Month.valueFromInteger(6));
	}

	@Test
	public void testValueFromInteger_7() {
		assertEquals(Month.JULY, Month.valueFromInteger(7));
	}

	@Test
	public void testValueFromInteger_8() {
		assertEquals(Month.AUGUST, Month.valueFromInteger(8));
	}
	
	@Test
	public void testValueFromInteger_9() {
		assertEquals(Month.SEPTEMBER, Month.valueFromInteger(9));
	}
	
	@Test
	public void testValueFromInteger_10() {
		assertEquals(Month.OCTOBER, Month.valueFromInteger(10));
	}

	@Test
	public void testValueFromInteger_11() {
		assertEquals(Month.NOVEMBER, Month.valueFromInteger(11));
	}
	
	@Test
	public void testValueFromInteger_12() {
		assertEquals(Month.DECEMBER, Month.valueFromInteger(12));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testValueFromInteger_13() {
		Month.valueFromInteger(13);
	}

	@Test
	public void testValueFromString_January() {
		assertEquals(Month.JANUARY, Month.valueFromString("January"));
	}


	@Test
	public void testValueFromString_janUary() {
		assertEquals(Month.JANUARY, Month.valueFromString("janUary"));
	}

	@Test
	public void testValueFromString_Jan() {
		assertEquals(Month.JANUARY, Month.valueFromString("Jan"));
	}

	@Test
	public void testValueFromString_jan() {
		assertEquals(Month.JANUARY, Month.valueFromString("jan"));
	}

	@Test
	public void testValueFromString_December() {
		assertEquals(Month.DECEMBER, Month.valueFromString("December"));
	}


	@Test
	public void testValueFromString_decEmber() {
		assertEquals(Month.DECEMBER, Month.valueFromString("decEmber"));
	}

	@Test
	public void testValueFromString_Dec() {
		assertEquals(Month.DECEMBER, Month.valueFromString("Dec"));
	}

	@Test
	public void testValueFromString_dec() {
		assertEquals(Month.DECEMBER, Month.valueFromString("dec"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testValueFromString_invalid() {
		Month.valueFromString("Montag");
	}

}
