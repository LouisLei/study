package com.lakala.ipos.report.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lakala.ipos.report.dao.IposDevinfoDataSummaryMapper;
import com.lakala.ipos.report.domain.IposDevinfoDataSummary;
import com.lakala.ipos.report.service.IposDeviInfoService;

@Service
public class IposDeviInfoServiceImpl implements IposDeviInfoService{

	private static final Logger LOGGER = LoggerFactory.getLogger(IposDeviInfoServiceImpl.class);
	
	@Autowired
	public IposDevinfoDataSummaryMapper iposDevinfoDataSummaryMapper;

	@Override
	public List<IposDevinfoDataSummary> queryDeviInfo(String packageName) {
		LOGGER.info("packageName : " + packageName);
		List<IposDevinfoDataSummary> list = iposDevinfoDataSummaryMapper.selectByPackageName(packageName);
		return list;
	}
	
	
	
}
