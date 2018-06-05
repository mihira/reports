package com.mihira.domain;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class MetricsHelperTest {

	@Test
	public void testCalculateAndSetClickThroughRate() {
		Metrics metrics = new Metrics();
		metrics.setClicks(new BigDecimal("30965"));
		metrics.setImpressions(new BigDecimal("11866157"));
		MetricsHelper.calculateAndSetClickThroughRate(metrics);
		assertEquals("0.26", metrics.getClickThroughRate().toString());
	}

	@Test
	public void testCalculateAndSetConversionRate() {
		Metrics metrics = new Metrics();
		metrics.setConversions(new BigDecimal("7608"));
		metrics.setImpressions(new BigDecimal("11866157"));
		MetricsHelper.calculateAndSetConversionRate(metrics);
		assertEquals("0.06", metrics.getConversionRate().toString());
	}

	@Test
	public void testCalculateAndSetFillRate() {
		Metrics metrics = new Metrics();
		metrics.setImpressions(new BigDecimal("11866157"));
		metrics.setRequests(new BigDecimal("12483775"));
		MetricsHelper.calculateAndSetFillRate(metrics);
		assertEquals("95.05", metrics.getFillRate().toString());
	}

	@Test
	public void testCalculateAndSetEffectiveCostPerThousand() {
		Metrics metrics = new Metrics();
		metrics.setRevenue(new BigDecimal("23555.46"));
		metrics.setImpressions(new BigDecimal("11866157"));
		MetricsHelper.calculateAndSetEffectiveCostPerThousand(metrics);
		assertEquals("1.99", metrics.getEffectiveCostPerThousand().toString());
	}

}
