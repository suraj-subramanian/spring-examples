/**
 * 
 */
package com.jpm.spring.controller;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Smita B Kumar
 *
 */
//prep-work-1 annotate the controller
@Controller
@RequestMapping("/")
public class HomeController {
	
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String showHomePage(Model model) {
		model.addAttribute("msg", 
				"Welcome to the beautiful world of Spring MVC!");
		return "index";
	}
	
	@RequestMapping("/about")
	public ModelAndView showAboutPage(ModelAndView mv) {
		mv.addObject("info", "Intro to Spring MVC");
		mv.addObject("date", LocalDate.now());
		mv.setViewName("aboutPage");
		return mv;
	}

}













