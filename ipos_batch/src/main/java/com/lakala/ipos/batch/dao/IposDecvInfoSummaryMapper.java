package com.lakala.ipos.batch.dao;

import java.util.List;

import com.lakala.ipos.batch.domain.IposDecvInfo;
import com.lakala.ipos.batch.domain.IposDecvSummary;

public interface IposDecvInfoSummaryMapper {
	
	public List<IposDecvInfo> selectNewRecordByTime();
	
	public void insertByBatch(List<IposDecvSummary> list);

}
