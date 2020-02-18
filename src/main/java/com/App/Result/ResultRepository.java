package com.App.Result;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;



@Repository("resultRepository")
public interface ResultRepository extends JpaRepository<Result, String>{
	

	Result findBybatchName(String batchName);


}
