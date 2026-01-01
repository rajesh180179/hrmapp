package com.examples.hrm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hrm")
public class IndexController {
	
@GetMapping("/index")
public String indexPage() {
	
	return "index";
	
}

}
