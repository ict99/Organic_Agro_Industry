package com.controller;


import org.springframework.validation.BindingResult;
import com.model.AgroProduct;
import com.service.AgroService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

//use appropriate annotation to configure AgroController as Controller
public class AgroController {
	
	//Use appropriate annotation
	private AgroService agroService;	
	 
	//invoke the service class - calculateTotalCost method.
	public ModelAndView calculateCostAndUpdate(@ModelAttribute("agroProduct")AgroProduct agroProduct, BindingResult result,ModelAndView model){
		
		//fill the code
		return model;
	}
	
	//use appropriate annotation to handle the Exception
	public ModelAndView exceptionHandler(Exception e) {
		
		//fill the code
		return null;
	}
	
}
