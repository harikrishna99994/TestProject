package com.demo.resrevation_mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.resrevation_mvc.model.Reservation;

@Controller
@RequestMapping("/reservation")
public class ReservationController {
	
	@Autowired
	Reservation res; 
	
	@RequestMapping("/")
	public String hello() {
		
		return "welcome";
	}
   
	@RequestMapping("/bookingForm")
	public String bookingForm(Model model) {
		model.addAttribute("reservation", res);
		return "reservation-page";
	}
	
	@RequestMapping("/submitForm") 
	public String submitForm( Reservation res)  
	{  
	    return "confirmation-page";  
	}
}
