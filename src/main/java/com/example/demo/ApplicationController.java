package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationController {
	@Autowired
	private myRepo repo;
	
	@GetMapping("")
	public String viewHome(Model model)
	{
		model.addAttribute("car", new Car());
		return "home";
	}
//	@PostMapping("")
	//public String sendData(@ModelAttribute Car car, Model model)
	//{
		//model.addAttribute("car", new Car());
	//	return "result";
//	}
}
