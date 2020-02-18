//package com.App.Faculty;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Service;
//
//@Service("faculty_Service_Imp")
//public class Faculty_Service_Imp {
//
//	@Autowired
//	private FacultyRepository repo;
//	
//	@Query(value = "SELECT COUNT(day) FROM result WHERE facultyname = :facultyname AND day = :day", 
//		      nativeQuery = true)
//	public Integer findDayByFacultyName(
//			  @Param("facultyname") String facultyname, @Param("day") String day) {
//		return repo.findDayPerFacultyName(facultyname, day);
//	}
//	
//	 public Faculty findByfacultyName(String facultyName) {
//		 return repo.findByfacultyName(facultyName);
//	 }
//
//}
