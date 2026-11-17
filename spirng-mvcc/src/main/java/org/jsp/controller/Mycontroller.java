package org.jsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {
	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		return "Wellcome to home";
	}
	@RequestMapping("/about")
	@ResponseBody
	public String about() {
		return "About page";
	}

}
