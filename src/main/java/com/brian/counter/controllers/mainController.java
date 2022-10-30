package com.brian.counter.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {
	
	@RequestMapping("/")
	public String index(HttpSession session) {
		if(session.getAttribute("count")== null) {
			session.setAttribute("count", 0);
		}
		return "index.jsp";
	}

		
	@RequestMapping("/your_server")
	public String Showcount(HttpSession session) {
		session.setAttribute("count", 1+(Integer) session.getAttribute("count"));
		return "showCount.jsp";
	}
}
