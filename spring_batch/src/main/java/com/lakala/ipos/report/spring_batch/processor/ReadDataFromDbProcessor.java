package com.lakala.ipos.report.spring_batch.processor;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.lakala.ipos.report.spring_batch.domain.IposDevinfoDataSummary;

/**
 * ItemProcessor<I,O> I指输入参数,O指输出参数
 */
@Service("readDataFromDbProcessor")
@Scope("step")
public class ReadDataFromDbProcessor implements ItemProcessor<IposDevinfoDataSummary, IposDevinfoDataSummary>{

	public IposDevinfoDataSummary process(IposDevinfoDataSummary iposDevinfoDataSummary)
			throws Exception {
		
		return iposDevinfoDataSummary;
	}

}