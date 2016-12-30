package com.lakala.ipos.report.spring_batch.listener;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.JobParameters;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

public class ReadFromDbJobListener implements JobExecutionListener {

	public void afterJob(JobExecution jobExecution) {

	}

	public void beforeJob(JobExecution jobExecution) {
		JobParameters jobParameters = jobExecution.getJobParameters();
		//jobParameters.getString("");
	}

}
