package com.App.Batch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
@Service("btach_Service_Search")
public class Batch_Service_Imp implements Btach_Service_Search{
	
	@Autowired
	private BatchRepository batchRepository;
	


	@Query(value = "SELECT COUNT(day) FROM result WHERE batch_name = :batchName AND day = :day", 
			nativeQuery = true)
	public Integer findDayByBatchName(
			@Param("batchName") String batchName, @Param("day") String day) {
		return batchRepository.findDayPerBatchName(batchName, day);
	}
	
	@Query(value = "SELECT total_student FROM batch WHERE batch_name = :batchName ",nativeQuery = true)
	public Integer findByTotalStudents( @Param("batchName") String batchName) {
		return batchRepository.findTotalStudents(batchName);
	}

	@Override
	public Batch findBatchbybatchName(String batchName) {
		// TODO Auto-generated method stub
		return batchRepository.findBybatchName(batchName);
	}
	

}
