//package com.App.Faculty;
//
//import java.util.List;
//
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.App.Batch.Batch;
//
//@Repository("facultyRepository")
//
//public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
//
//	 Faculty findByfacultyName(String facultyName);
//
//	@Query(value = "SELECT COUNT(day) FROM result WHERE facultyname = :facultyname AND day = :day", 
//		      nativeQuery = true)
//	Integer findDayPerFacultyName(
//			  @Param("facultyname") String facultyname, @Param("day") String day);
//}
