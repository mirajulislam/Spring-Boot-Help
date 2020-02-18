//package com.App.Faculty;
//
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//
//public interface IFaculty_Service {
//	@Query(value = "SELECT COUNT(day) FROM result WHERE facultyname = :facultyname AND day = :day", 
//		      nativeQuery = true)
//	Integer findDayByFacultyName(
//			  @Param("facultyname") String facultyname, @Param("day") String day);
//	
//	
//	 Faculty findByfacultyName(String facultyName);
//
//}
