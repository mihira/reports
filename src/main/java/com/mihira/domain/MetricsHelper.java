package com.mihira.domain;

import java.math.BigDecimal;

public class MetricsHelper {

	private static final int DECIMAL_SCALE = 2;

	private static final int DIVISION_SCALE = 5;

	private static final BigDecimal HUNDRED = new BigDecimal(100);

	private static final BigDecimal THOUSAND = new BigDecimal(1000);

	/**
	 * This function returns (dividend ÷ divisor)
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	private static BigDecimal divide(BigDecimal dividend, BigDecimal divisor) {
		return dividend.divide(divisor, DIVISION_SCALE, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * This function returns (dividend ÷ divisor) × 100%
	 * @param dividend
	 * @param divisor
	 * @return
	 */
	private static BigDecimal calculatePercentualRate(BigDecimal dividend, BigDecimal divisor) {
		return divide(dividend, divisor)
				.multiply(HUNDRED).setScale(DECIMAL_SCALE, BigDecimal.ROUND_HALF_UP);
	}
	/**
	 * This function calculates and sets the CTR on the metrics parameter.
	 * Null pointers are expected if clicks or impressions are not initialized.
	 * CTR = (clicks ÷ impressions) × 100%
	 * @param metrics
	 */
	public static void calculateAndSetClickThroughRate(Metrics metrics) {
		metrics.setClickThroughRate(calculatePercentualRate(metrics.getClicks(), metrics.getImpressions()));
	}

	/**
	 * This function calculates and sets the CR on the metrics parameter.
	 * Null pointers are expected if conversions or impressions are not initialized.
	 * CR = (conversions ÷ impressions) × 100%
	 * @param metrics
	 */
	public static void calculateAndSetConversionRate(Metrics metrics) {
		metrics.setConversionRate(calculatePercentualRate(metrics.getConversions(), metrics.getImpressions()));
	}

	/**
	 * This function calculates and sets the fill rate on the metrics parameter.
	 * Null pointers are expected if impressions or requests are not initialized.
	 * Fill Rate = (impressions ÷ requests) × 100%
	 * @param metrics
	 */
	public static void calculateAndSetFillRate(Metrics metrics) {
		metrics.setFillRate(calculatePercentualRate(metrics.getImpressions(), metrics.getRequests()));
	}

	/**
	 * This function calculates and sets the eCPM on the metrics parameter.
	 * Null pointers are expected if revenue or impressions are not initialized.
	 * eCPM = (revenue × 1000) ÷ impressions
	 * @param metrics
	 */
	public static void calculateAndSetEffectiveCostPerThousand(Metrics metrics) {
		metrics.setEffectiveCostPerThousand(divide(metrics.getRevenue(), metrics.getImpressions())
				.multiply(THOUSAND).setScale(DECIMAL_SCALE, BigDecimal.ROUND_HALF_UP));
	}

}
