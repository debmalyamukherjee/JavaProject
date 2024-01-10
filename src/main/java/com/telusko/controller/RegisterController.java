package com.telusko.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.telusko.model.SpringersSpringBoot;

@Controller
public class RegisterController {
	
	@GetMapping("/springerReg")
    public String responseHome()
    {
    	return "register";
    }
	
	@PostMapping("/springerReg")
	public String registerData(Map<String,Object> model, @ModelAttribute("")SpringersSpringBoot springer ) {
		model.put("springer", springer);
		return "result";
	}
	
//	@PostMapping("springerReg")
//  public String registerData(Map<String, Object> model, HttpServletRequest request)
//  {
//		Integer id=request.getParameter("sid");
//		Integer id=request.getParameter("sid");
//		Integer id=request.getParameter("sid");
//		Integer id=request.getParameter("sid");
//		//System.out.println(springer);
//		Springers spg=new Springers();
//		spg.setScity(scity);
//		spg.setSname(sname);
//		model.put("springer", spg);
//  	return "result";
//  }

	
}
