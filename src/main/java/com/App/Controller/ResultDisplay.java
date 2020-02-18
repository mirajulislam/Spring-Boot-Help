//package com.App.Controller;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.App.Batch.Batch;
//import com.App.Batch.BatchService;
//import com.App.Course.Course;
//import com.App.Course.CourseService;
//import com.App.Faculty.Faculty;
//import com.App.Faculty.FacultyService;
//import com.App.Result.Result;
//import com.App.Result.ResultService;
//import com.App.Result.Result_Service;
//import com.App.Routine.Routine;
//import com.App.Routine.RoutineService;
//
//
//
//@Controller
//public class ResultDisplay {
//	@Autowired
//  private	ResultService resultService;
//	@Autowired
//	  private Result_Service result_Service;
//	@Autowired
//	  private RoutineService routineService;
//	@Autowired
//	  private  BatchService batchService;
//	@Autowired
//	  private CourseService courseService;
//	
//	@Autowired
//	  private FacultyService facultyService;
//
//	
//	@RequestMapping("/result")
//	public String viewResult(Model model) {
//		List<Result> resultShow =resultService.listAllResults();
//		model.addAttribute("data", resultShow);
//		
//		return "user/ResultShow";
//	}
//
//	
//	@RequestMapping("/routine")
//	public String viewRoutine(Model model) {
//		List<Routine> routineShow =routineService.listAllRoutines();
//		model.addAttribute("routine_result", routineShow);
//		
//		return "user/RoutingShow";
//	}
//	
//	@RequestMapping(value= {"/", "/routinegenerate"},method=RequestMethod.GET)
//	public ModelAndView routineRoutine(Model model) {
//		
//		List<Course>courselist=courseService.listCourseAll();
//		
//		model.addAttribute("courselist", courselist);
//		
//		List<Batch>batchlist=batchService.listAllBatches();
//		model.addAttribute("batches",batchlist);
//		
//		List<Faculty>facultyList=facultyService.listFacultyAll();
//		model.addAttribute("facultys",facultyList);
//		
////		List<String>lstfac = null;
////		for(Faculty f : facultyList) {
////			lstfac.add(f.getFacultyname());
////			
////		}
//		
//		
//		
//		 ModelAndView model1 = new ModelAndView();
//          Result result=new Result();
//          model1.addObject("result", result);
//          model1.setViewName("user/insert");
//          
//		return model1;
//	}
//	
//	 @RequestMapping(value= {"/submited"}, method=RequestMethod.POST)
//	 public ModelAndView searchBatch(@Valid Result result, BindingResult bindingResult) {		 	 
//	  ModelAndView model = new ModelAndView();
//	  
//	     int p=  BatchCount();
//	     
//	     if(p==2) {
//	    	  bindingResult.rejectValue("batchName", "error.result", "This Batch already exists!");
//	     }
//	     if(bindingResult.hasErrors()) {
//	  	   model.setViewName("user/insert");
//	  	  } else {
////		   resultService.saveResult(result);
//	  		   model.addObject("msg", "User has been registered successfully!");
////	  		   model.addObject("result", new Result());
//	  		   model.setViewName("user/insert");
//	  		  }
//	 
//	  
////	  database one value search
////	  Result nameExists = result_Service.findBatchByBatchName(result.getBatchName());
////	  if(nameExists != null) {
////	   bindingResult.rejectValue("batchName", "error.result", "This Batch already exists!");
////	  }
////	  if(bindingResult.hasErrors()) {
////	   model.setViewName("user/insert");
////	  } else {
//////	   resultService.saveResult(result);
////	   model.addObject("msg", "User has been registered successfully!");
//////	   model.addObject("result", new Result());
////	   model.setViewName("user/insert");
////	  }
//	  
//	  
//  
//	  return model;
//	 }
//	 
//	 
//	 public int BatchCount() {
//	      String store="Temp4";
//	      
//	  	
//	  	List<Result> resultShow =resultService.listAllResults();
//	  	
//	  	List<String>resultList = new ArrayList<String>() ;
//	  	
//	  	for(Result f : resultShow) {
//	  		resultList.add(f.getBatchName());
//	  	}
//	  	int count = 0;
//	  	for(String str : resultList) {
//	  		if(str!=null) {
//	  			if(str.equals(store)) {
//	  				count++;
//	  			}
//	  			
//	  		}
//	  			
//	  		
//	  	}
//	  	
//	  	return count;
//		 
//	 }
//	
//}
//
//
//
//
//
