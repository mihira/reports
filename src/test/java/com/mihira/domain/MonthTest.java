package com.mihira.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonthTest {

	@Test(expected = IllegalArgumentException.class)
	public void testvalueFromObject_0() {
		Month.valueFromObject(0);
	}

	@Test
	public void testvalueFromObject_1() {
		assertEquals(Month.JANUARY, Month.valueFromObject(1));
	}

	@Test
	public void testvalueFromObject_2() {
		assertEquals(Month.FEBRUARY, Month.valueFromObject(2));
	}
	
	@Test
	public void testvalueFromObject_3() {
		assertEquals(Month.MARCH, Month.valueFromObject(3));
	}
	
	@Test
	public void testvalueFromObject_4() {
		assertEquals(Month.APRIL, Month.valueFromObject(4));
	}

	@Test
	public void testvalueFromObject_5() {
		assertEquals(Month.MAY, Month.valueFromObject(5));
	}
	
	@Test
	public void testvalueFromObject_6() {
		assertEquals(Month.JUNE, Month.valueFromObject(6));
	}

	@Test
	public void testvalueFromObject_7() {
		assertEquals(Month.JULY, Month.valueFromObject(7));
	}

	@Test
	public void testvalueFromObject_8() {
		assertEquals(Month.AUGUST, Month.valueFromObject(8));
	}
	
	@Test
	public void testvalueFromObject_9() {
		assertEquals(Month.SEPTEMBER, Month.valueFromObject(9));
	}
	
	@Test
	public void testvalueFromObject_10() {
		assertEquals(Month.OCTOBER, Month.valueFromObject(10));
	}

	@Test
	public void testvalueFromObject_11() {
		assertEquals(Month.NOVEMBER, Month.valueFromObject(11));
	}
	
	@Test
	public void testvalueFromObject_12() {
		assertEquals(Month.DECEMBER, Month.valueFromObject(12));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testvalueFromObject_13() {
		Month.valueFromObject(13);
	}
	
	@Test
	public void testvalueFromObject_String_12() {
		assertEquals(Month.DECEMBER, Month.valueFromObject("12"));
	}

	@Test
	public void testvalueFromObject_January() {
		assertEquals(Month.JANUARY, Month.valueFromObject("January"));
	}


	@Test
	public void testvalueFromObject_janUary() {
		assertEquals(Month.JANUARY, Month.valueFromObject("janUary"));
	}

	@Test
	public void testvalueFromObject_Jan() {
		assertEquals(Month.JANUARY, Month.valueFromObject("Jan"));
	}

	@Test
	public void testvalueFromObject_jan() {
		assertEquals(Month.JANUARY, Month.valueFromObject("jan"));
	}

	@Test
	public void testvalueFromObject_December() {
		assertEquals(Month.DECEMBER, Month.valueFromObject("December"));
	}


	@Test
	public void testvalueFromObject_decEmber() {
		assertEquals(Month.DECEMBER, Month.valueFromObject("decEmber"));
	}

	@Test
	public void testvalueFromObject_Dec() {
		assertEquals(Month.DECEMBER, Month.valueFromObject("Dec"));
	}

	@Test
	public void testvalueFromObject_dec() {
		assertEquals(Month.DECEMBER, Month.valueFromObject("dec"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testvalueFromObject_invalid() {
		Month.valueFromObject("Montag");
	}

}
