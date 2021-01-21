package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class JsonTestController {
	
	@RequestMapping(value="/jsonTest", method=RequestMethod.GET)
	public String jsonTest() {
		return "jsonTest";
	}

}
