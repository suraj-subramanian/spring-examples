package com.jpm.hr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jpm.hr.entities.Employee;
import com.jpm.hr.exceptions.HrExceptions;
import com.jpm.hr.services.HrServices;

/*
 * http://localhost:8082/home
 */
@Controller
public class HrControllerImpl {
	@Autowired
	@Qualifier("hrServices")
	private HrServices services;
	
	@RequestMapping("/home")
	public String getHomePage(){
		return "Home";
	}
	
	@RequestMapping("/empDetails")
	public ModelAndView getEmpDetails() throws HrExceptions{
		Employee emp = services.getEmpDetails(7499);
		ModelAndView mAndV = new ModelAndView("ViewDetails");
		mAndV.addObject("emp", emp);
		return mAndV;
	}
}
