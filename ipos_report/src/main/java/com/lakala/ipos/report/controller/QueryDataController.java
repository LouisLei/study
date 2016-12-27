package com.lakala.ipos.report.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.lakala.ipos.report.domain.IposDevinfoDataSummary;
import com.lakala.ipos.report.service.impl.IposDeviInfoServiceImpl;

@RestController
@RequestMapping(value="query")
public class QueryDataController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(QueryDataController.class);

	@Autowired
	private IposDeviInfoServiceImpl iposDeviInfoServiceImpl;
	 
	@RequestMapping(value="/queryDecvInfo",method = RequestMethod.GET)
	public String queryDecvInfo(@RequestParam("appId") String appId){
		LOGGER.info("AppId : " + appId);
		List<IposDevinfoDataSummary> list = iposDeviInfoServiceImpl.queryDeviInfo(appId);
		String json = JSONObject.toJSONString(list);
		return json;
	}

}
