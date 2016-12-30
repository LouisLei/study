package com.lakala.ipos.report.spring_batch.job.test;

import java.util.Date;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 从文件中读取数据写入到数据库中
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context/applicationContext.xml")
public class ReadFromFileJobTest {
	
	private static final Logger LOGGER = Logger.getLogger(ReadFromFileJobTest.class);
	
	@Autowired
	private Job readFromDbJob;
	@Autowired
	private JobLauncher jobLauncher;
	
	@Test
	public void readFromDbJob() throws JobExecutionAlreadyRunningException, JobRestartException, JobInstanceAlreadyCompleteException, JobParametersInvalidException{
		
		PropertyConfigurator.configure("src/main/resources/properties/log4j.properties");
		JobParametersBuilder jobParametersBuilder = new JobParametersBuilder();
		jobParametersBuilder.addString("startTime", new Date().toString());
		JobExecution result = jobLauncher.run(readFromDbJob,jobParametersBuilder.toJobParameters());
		ExitStatus es = result.getExitStatus();
		if (es.getExitCode().equals(ExitStatus.COMPLETED.getExitCode())) {
			LOGGER.info("任务正常完成");
		} else {
			LOGGER.info("任务失败，exitCode=" + es.getExitCode());
		}
		
	}

}
