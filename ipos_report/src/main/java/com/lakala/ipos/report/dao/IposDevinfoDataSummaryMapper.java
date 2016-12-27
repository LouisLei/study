package com.lakala.ipos.report.dao;

import java.util.List;
import com.lakala.ipos.report.domain.IposDevinfoDataSummary;

public interface IposDevinfoDataSummaryMapper {
	
	List<IposDevinfoDataSummary> selectByPackageName(String package_name);
	
	List<IposDevinfoDataSummary> selectAll();
	
}