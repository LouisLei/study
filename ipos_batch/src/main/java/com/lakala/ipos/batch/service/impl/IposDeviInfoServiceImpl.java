package com.lakala.ipos.batch.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import com.alibaba.fastjson.JSON;
import com.lakala.ipos.batch.dao.IposDecvInfoMapper;
import com.lakala.ipos.batch.dao.IposDecvInfoSummaryMapper;
import com.lakala.ipos.batch.domain.IposDecvInfo;
import com.lakala.ipos.batch.domain.IposDecvSummary;
import com.lakala.ipos.batch.service.IposDeviInfoService;

@Service
public class IposDeviInfoServiceImpl implements IposDeviInfoService{

	@Autowired
	public IposDecvInfoMapper iposDecvInfoMapper;
	
	@Autowired
	public IposDecvInfoSummaryMapper iposDecvInfoSummaryMapper;
	
	public List<IposDecvSummary> getLatestRecord() {
		
		List<IposDecvInfo> iposDecvInfoList = iposDecvInfoMapper.selectNewRecordByTime();
		List<IposDecvSummary> iposDecvSummaryList = new ArrayList<IposDecvSummary>();
		
		if(CollectionUtils.isEmpty(iposDecvInfoList)){
			return null;
		}
		
		for(IposDecvInfo iosDecvInfo : iposDecvInfoList){
			List<IposDecvSummary> list = JSON.parseArray(iosDecvInfo.getApp(), IposDecvSummary.class);
			for(IposDecvSummary iposDecvSummary : list){
				iposDecvSummary.setSn(iosDecvInfo.getSn());
			}
			iposDecvSummaryList.addAll(list);
		}
		
		return iposDecvSummaryList;
	}

	public void persistSummaryData(List<IposDecvSummary> list) {
		
		iposDecvInfoSummaryMapper.insertByBatch(list);
		
	}
	

}
