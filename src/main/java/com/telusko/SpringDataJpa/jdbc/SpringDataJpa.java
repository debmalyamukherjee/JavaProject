package com.telusko.SpringDataJpa.jdbc;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


public interface SpringDataJpa  extends JpaRepository<CourseInfo,Integer>{
	
	//List<CourseInfo> findByCname(String cname);

}
