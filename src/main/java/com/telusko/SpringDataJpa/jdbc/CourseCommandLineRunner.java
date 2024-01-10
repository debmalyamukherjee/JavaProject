package com.telusko.SpringDataJpa.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

	@Autowired
    private SpringDataJpa app;
	
	@Override
	public void run(String... args) throws Exception {
    
//		app.save(new CourseInfo(5,"Html"));
//		app.save(new CourseInfo(8,"Css"));
//		app.save(new CourseInfo(9,"Javascript"));
//		
//		app.deleteById(9);
//		
//		System.out.println(app.findById(1));
//		System.out.println(app.findById(2));
//		System.out.println(app.findById(3));
//		System.out.println(app.findById(4));
		
	//	System.out.println(app.findByCname("JAVA"));
		
	  app.save(new CourseInfo(8,"Dev"));
		
		
	 
 	
		
		
	}
	


}
