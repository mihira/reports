package com.mihira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mihira.domain.Month;
import com.mihira.domain.SiteType;

@Controller
public class ReportsController {
	@RequestMapping
	@ResponseBody
	public String reports(@RequestParam("site") String siteParam, @RequestParam("month") String monthParam) {
		if (!siteParam.isEmpty() && !monthParam.isEmpty()) {
			Month month = Month.valueFromObject(monthParam);
			SiteType siteType = SiteType.valueFromString(siteParam);
			// handle parameters using Helper functions
			return String.format("site=%s, month=%s", siteType.getName(), month.getName());
		}
		return "Invalid parameters";
	}
}
