package com.lakala.ipos.report.spring_batch.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.simple.ParameterizedRowMapper;

import com.lakala.ipos.report.spring_batch.domain.IposDevinfoDataSummary;

public class IposDevinfoRowMapper implements ParameterizedRowMapper<IposDevinfoDataSummary>{
	
	public IposDevinfoDataSummary mapRow(ResultSet rs, int rowNum) throws SQLException {  
		
		IposDevinfoDataSummary iposDevinfoDataSummary = new IposDevinfoDataSummary();  
		
		iposDevinfoDataSummary.setId(rs.getLong("id"));  
		iposDevinfoDataSummary.setSn(rs.getString("sn"));
		iposDevinfoDataSummary.setPackageName(rs.getString("package_name")); 
		iposDevinfoDataSummary.setVersionCode(rs.getString("version_code")); 
		iposDevinfoDataSummary.setVersionName(rs.getString("version_name"));
        
		return iposDevinfoDataSummary;  
    } 

}
