package com.learnspring3.mvcmodule2.taglibanddatabinding;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String showPage() {
		return "student-menu";
	}
}
