package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//need a controller method to show initial form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//controller method to process form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read form data
	//add data to the model
	@RequestMapping("/processFormVtwo")
	public String letsNotShout(@RequestParam("studentNameCaps") String thetheName, Model model) {
		
		//read the request from html form
//		String theName = request.getParameter("studentName");
		
		//convert to all caps
		String result = thetheName.toLowerCase();
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	@RequestMapping("/processFormVthree")
	public String letsShout(HttpServletRequest request, Model model) {
		
		//read the request from html form
		String theName = request.getParameter("studentName");
		
		//convert to all caps
		String result = theName.toUpperCase();
		
		//add message to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	

}
