package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

	@RequestMapping("/showForm")
	public String showForm() {
		
		return "helloworld";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		
		return "helloworld-form";
	}
	@RequestMapping("/processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		String theName =request.getParameter("studentName");
		
		theName= theName.toUpperCase();
		
		String result = "Yo! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld-form";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormVersionThree(@RequestParam("studentName") String theName, Model model) {
		
		theName= theName.toUpperCase();
		
		String result = "Hey My Friend! " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld-form";
		
	}
}