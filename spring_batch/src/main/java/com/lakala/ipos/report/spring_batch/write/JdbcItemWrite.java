package com.lakala.ipos.report.spring_batch.write;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.lakala.ipos.report.spring_batch.domain.IposDevinfoDataSummary;

public class JdbcItemWrite implements ItemWriter<IposDevinfoDataSummary>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sql = "INSERT INTO ipos_device_bak.ipos_devinfo_data_summary ( sn, package_name, version_code, version_name) VALUES ( ?, ?, ?, ?)";
	
	public void write(List<? extends IposDevinfoDataSummary> items)
			throws Exception {
		
		for(IposDevinfoDataSummary item : items){
			jdbcTemplate.update(sql, new Object[]{item.getSn(),item.getPackageName(),item.getVersionCode(),item.getVersionName()});
		}
		
	}

}
