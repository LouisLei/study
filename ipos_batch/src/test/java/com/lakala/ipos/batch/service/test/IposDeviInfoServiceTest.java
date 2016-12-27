package com.lakala.ipos.batch.service.test;

import java.util.List;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lakala.ipos.batch.domain.IposDecvSummary;
import com.lakala.ipos.batch.service.impl.IposDeviInfoServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context/applicationContext.xml")
public class IposDeviInfoServiceTest{
	
	private static final Logger LOGGER = Logger.getLogger(IposDeviInfoServiceTest.class);
	
	@Autowired
	private IposDeviInfoServiceImpl iposDeviInfoServiceImpl;
	
	@Test
	public void getLatestRecord(){
		List<IposDecvSummary> iposDecvSummaryList = iposDeviInfoServiceImpl.getLatestRecord();
		iposDeviInfoServiceImpl.persistSummaryData(iposDecvSummaryList);
		LOGGER.info("iposDecvSummaryList : " + iposDecvSummaryList.size());
	}
	
}
