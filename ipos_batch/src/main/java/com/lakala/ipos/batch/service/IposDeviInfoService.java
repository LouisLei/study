package com.lakala.ipos.batch.service;

import java.util.List;
import com.lakala.ipos.batch.domain.IposDecvSummary;

public interface IposDeviInfoService {

	public List<IposDecvSummary> getLatestRecord();
	
	public void persistSummaryData(List<IposDecvSummary> list);
	
}
