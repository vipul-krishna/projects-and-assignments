package com.yusuf.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController extends MyController{
	
	
	@RequestMapping(value = "/user/add.htm", method = RequestMethod.GET)
	public String ShowFormPage(){
		return "user-form";
	}
	
	@RequestMapping(value = "/user/add.htm", method = RequestMethod.POST)
	public ModelAndView addUser(HttpServletRequest request){
		
		
		return new ModelAndView("user-success");
	}

}
