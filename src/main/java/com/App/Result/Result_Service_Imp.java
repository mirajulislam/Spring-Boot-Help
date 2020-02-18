package com.App.Result;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("result_Service")
public class Result_Service_Imp implements Result_Service{
	
	@Autowired
	private ResultRepository resultRepository;
	

//
	@Override
	public Result findBatchByBatchName(String batchName) {
		return resultRepository.findBybatchName(batchName);
	}

	
	

	

}
