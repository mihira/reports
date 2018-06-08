package com.mihira.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class SiteTypeTest {

	@Test
	public void test_valueFromString_android() {
		assertEquals(SiteType.ANDROID, SiteType.valueFromString("android"));
	}

	@Test
	public void test_valueFromString_iOS() {
		assertEquals(SiteType.IOS, SiteType.valueFromString("iOS"));
	}

	@Test
	public void test_valueFromString_desktop() {
		assertEquals(SiteType.DESKTOP, SiteType.valueFromString("desktop_web"));
	}

	@Test
	public void test_valueFromString_mobile() {
		assertEquals(SiteType.MOBILE, SiteType.valueFromString("mobile_web"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void test_valueFromString_invalid() {
		SiteType.valueFromString("unix terminal");
	}

}
