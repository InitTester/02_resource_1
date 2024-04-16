package com.portfolio.www.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InOutController {

	 public InOutController() {		
		// TODO Auto-generated constructor stub
		System.out.println("\n\n---------02_1 컨트롤러 생성됨---------\n\n");
	 }
	
	@RequestMapping("/input.do")
	public String input() {
		return "input";
	}
	
	@RequestMapping("/output.do")
	public ModelAndView output(@RequestParam HashMap<String, String> params) {

		ModelAndView mv = new ModelAndView();
		mv.setViewName("output");
		mv.addObject("measureDate", "2024-01-01");
		return mv;
	}	
}
