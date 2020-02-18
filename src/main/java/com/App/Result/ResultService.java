package com.App.Result;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("resultService")

public class ResultService {

	@Autowired
	private ResultRepository resultRepository;
	
	public List<Result> listAllResults() {
		return resultRepository.findAll();
	}

	
	}
	
