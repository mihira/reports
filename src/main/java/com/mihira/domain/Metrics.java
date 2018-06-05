package com.mihira.domain;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Metrics {

	private Month month;

	private SiteType site;

	private BigDecimal requests;

	private BigDecimal impressions;

	private BigDecimal clicks;

	private BigDecimal conversions;

	private BigDecimal revenue;

	// CTR
	private BigDecimal clickThroughRate;

	// CR
	private BigDecimal conversionRate;

	private BigDecimal fillRate;

	// eCPM
	private BigDecimal effectiveCostPerThousand;

	public Metrics() {
		// empty constructor
	}

	public Month getMonth() {
		return month;
	}

	public void setMonth(Month month) {
		this.month = month;
	}

	public SiteType getSite() {
		return site;
	}

	public void setSite(SiteType site) {
		this.site = site;
	}

	public BigDecimal getRequests() {
		return requests;
	}

	public void setRequests(BigDecimal requests) {
		this.requests = requests;
	}

	public BigDecimal getImpressions() {
		return impressions;
	}

	public void setImpressions(BigDecimal impressions) {
		this.impressions = impressions;
	}

	public BigDecimal getClicks() {
		return clicks;
	}

	public void setClicks(BigDecimal clicks) {
		this.clicks = clicks;
	}

	public BigDecimal getConversions() {
		return conversions;
	}

	public void setConversions(BigDecimal conversions) {
		this.conversions = conversions;
	}

	public BigDecimal getRevenue() {
		return revenue;
	}

	public void setRevenue(BigDecimal revenue) {
		this.revenue = revenue;
	}

	public BigDecimal getClickThroughRate() {
		return clickThroughRate;
	}

	public void setClickThroughRate(BigDecimal clickThroughRate) {
		this.clickThroughRate = clickThroughRate;
	}

	public BigDecimal getConversionRate() {
		return conversionRate;
	}

	public void setConversionRate(BigDecimal conversionRate) {
		this.conversionRate = conversionRate;
	}

	public BigDecimal getFillRate() {
		return fillRate;
	}

	public void setFillRate(BigDecimal fillRate) {
		this.fillRate = fillRate;
	}

	public BigDecimal getEffectiveCostPerThousand() {
		return effectiveCostPerThousand;
	}

	public void setEffectiveCostPerThousand(BigDecimal effectiveCostPerThousand) {
		this.effectiveCostPerThousand = effectiveCostPerThousand;
	}

}