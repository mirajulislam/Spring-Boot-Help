package com.App;

import java.util.ArrayList;
import java.util.List;

//import java.util.Random;
//
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.App.Batch.Batch;
import com.App.Batch.BatchService;
import com.App.Batch.Batch_Service_Imp;
import com.App.Batch.Btach_Service_Search;
import com.App.Faculty.Faculty;
//import com.App.Faculty.Faculty_Service_Imp;
import com.App.Result.Result;
//
//import com.App.Batch.Batch;
//import com.App.Batch.BatchRepository;
//import com.App.Batch.BatchService;
//import com.App.Batch.Batch_Service_Imp;
//import com.App.Result.Result;
import com.App.Result.ResultRepository;
//import com.App.Result.Result_Service_Imp;
//import com.App.Room.RoomRepository;
//import com.App.Room.Room_Service_Imp;
//import com.App.Routine.Routine_Service_Imp;
//import com.App.connection.DbConnection;
//import com.App.connection.Test;
import com.App.Result.ResultService;
import com.App.Result.Result_Service_Imp;
import com.App.Room.RoomRepository;
import com.App.Routine.Routine_Service_Imp;



@SpringBootApplication
public class RoutineGenerateApplication implements CommandLineRunner{
	@Autowired
	BatchService batchService;
	
	@Autowired
	Btach_Service_Search btach_Service_Search;
	@Autowired
	private	ResultService resultService;
	@Autowired
	private ResultRepository resultRepository;
//	
	@Autowired
	private RoomRepository roomRepository;
	
	@Autowired 
	Routine_Service_Imp routine_Service_Imp;
	
	@Autowired
	Batch_Service_Imp batch_Service_Imp;

//	@Autowired
//	Faculty_Service_Imp faculty_Service_Imp;
	
//	@Autowired
//	Batch batch;
//	
//	@Autowired
//	Faculty faculty;
//	
	
	
//	@Autowired
//	Room_Service_Imp room_Service_Imp;
//	//Hard coded value
//	String facultyName = "Mash";
//	String batchName= "A";
//	String courseName= "Data structure";	
	
	

	public static void main(String[] args) {
		SpringApplication.run(RoutineGenerateApplication.class, args);
	}
	
public void run(String... strings) throws Exception {

//	 batch = batch_Service_Imp.findPerbatchName("Temp4");
//	 
	Batch batch = batch_Service_Imp.findBatchbybatchName("Temp4");
//	 
	 System.out.println(batch.getId());
//	// System.out.println(faculty.getFacultyname());
	 
		
}


//		

}
