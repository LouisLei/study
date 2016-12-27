package com.lakala.ipos.report.service;

import java.util.List;

import com.lakala.ipos.report.domain.IposDevinfoDataSummary;

public interface IposDeviInfoService {
	
	public List<IposDevinfoDataSummary> queryDeviInfo(String packageName);

}
