package com.controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.model.BookRestaurant;

//use appropriate annotation to configure BookController as Controller
public class BookController {
	
	
	//invoke the service class - calculateTotalCost method.
	public String calculateTotalCost(@ModelAttribute("book") BookRestaurant book, 
			BindingResult result,ModelMap model) {
		
		//fill the code
		return null;
	}
	
}
