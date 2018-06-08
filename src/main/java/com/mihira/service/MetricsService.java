package com.mihira.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.mihira.domain.Metrics;
import com.mihira.domain.MetricsHelper;
import com.mihira.domain.Month;
import com.mihira.domain.SiteType;

@Service
public class MetricsService {
	
	private List<Metrics> metricsList;

	public MetricsService() {
		this.metricsList = new ArrayList<Metrics>();
		this.readFromCsvFiles();
		Metrics metrics = new Metrics();
		metrics.setSite(SiteType.DESKTOP);
		metrics.setMonth(Month.JANUARY);
		metrics.setClicks(new BigDecimal("30965"));
		metrics.setImpressions(new BigDecimal("11866157"));
		metrics.setConversions(new BigDecimal("7608"));
		metrics.setRequests(new BigDecimal("12483775"));
		metrics.setRevenue(new BigDecimal("23555.46"));
		MetricsHelper.calculateAndSetClickThroughRate(metrics);
		MetricsHelper.calculateAndSetConversionRate(metrics);
		MetricsHelper.calculateAndSetEffectiveCostPerThousand(metrics);
		MetricsHelper.calculateAndSetFillRate(metrics);
		this.metricsList.add(metrics);
	}

	private void readFromCsvFiles() {
		BufferedReader br = null;
			try {
				br = new BufferedReader(new FileReader("2018_01_report.csv"));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

	public List<Metrics> findAll() {
		return metricsList;
	}

}
