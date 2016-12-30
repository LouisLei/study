package com.lakala.ipos.report.spring_batch.write;

import java.util.List;

import org.springframework.batch.item.file.FlatFileItemWriter;

import com.lakala.ipos.report.spring_batch.domain.IposDevinfoDataSummary;

public class FlatFileItemWrite extends FlatFileItemWriter<IposDevinfoDataSummary>{

	@Override
	public void write(List<? extends IposDevinfoDataSummary> items)
			throws Exception {
		
		super.write(items);
	}
	
}
