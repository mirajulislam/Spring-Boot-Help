package com.App.Batch;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

public interface Btach_Service_Search {
	
public Batch findBatchbybatchName(String batchName);

	@Query(value = "SELECT COUNT(day) FROM result WHERE batch_name = :batchName AND day = :day", 
			nativeQuery = true)
	
	Integer findDayByBatchName(
			@Param("batchName") String batchName, @Param("day") String day);
	
	   @Query(value = "SELECT total_student FROM batch WHERE batch_name = :batchName ",nativeQuery = true)
		Integer findByTotalStudents( @Param("batchName") String batchName);
}
