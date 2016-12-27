package com.lakala.ipos.batch.job;

import java.util.List;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import com.lakala.ipos.batch.domain.IposDecvSummary;
import com.lakala.ipos.batch.service.impl.IposDeviInfoServiceImpl;

@Component("refreshDataDailyJob")
public class RefreshDataDailyJob {
	
	private static final Logger LOGGER = Logger.getLogger(RefreshDataDailyJob.class);
	
	@Autowired
	private IposDeviInfoServiceImpl iposDeviInfoServiceImpl;
	
	@Scheduled(cron="${deviceInfo.schedule}")
	public void refreshDeviInfoData(){
		LOGGER.info("start query ....");
		List<IposDecvSummary> iposDecvSummaryList = iposDeviInfoServiceImpl.getLatestRecord();
		
		iposDeviInfoServiceImpl.persistSummaryData(iposDecvSummaryList);
		LOGGER.info("iposDecvSummaryList 数量 : " + iposDecvSummaryList.size());
	}
	

}
