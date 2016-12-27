package com.lakala.ipos.batch.dao;

import java.util.List;
import com.lakala.ipos.batch.domain.IposDecvInfo;

public interface IposDecvInfoMapper {
	
	public List<IposDecvInfo> selectNewRecordByTime();

}
