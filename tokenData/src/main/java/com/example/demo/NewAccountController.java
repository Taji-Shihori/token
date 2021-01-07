package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewAccountController {
	
	@RequestMapping(value="/newaccount", method=RequestMethod.GET)
	public String newAccount(Model model) {
		return "newaccount";
	}

}
