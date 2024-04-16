package com.portfolio.www.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	public IndexController() {
		// TODO Auto-generated constructor stub
		System.out.println(" --- 프로젝트 생성 --- ");
	}
	
	@RequestMapping("/index.do")
	public String indexPage() {
		return "index";
	}
}
