package com.lakala.ipos.batch.job.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.lakala.ipos.batch.job.RefreshDataDailyJob;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:context/applicationContext.xml")
public class RefreshDataDailyJobTest {
	
	@Autowired
	private RefreshDataDailyJob refreshDataDailyJob;
	
	@Test
	public void refreshDeviInfoData(){
		
		while(true){
			
		}
	}
	
}
