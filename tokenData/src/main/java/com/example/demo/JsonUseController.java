package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;

@Controller
public class JsonUseController {
	
	@Autowired
	private JsonTestRepository jsonTestRepository;
	
	@RequestMapping(value="/jsonUse", method = RequestMethod.GET)
	@ResponseBody
	public String JsonUse(Model model) {
		Gson gson = new Gson();
		
		List<Chara> charList = jsonTestRepository.findAll();
		String json = gson.toJson(charList);
		System.out.println(json);
		
		return json;
	}
	

}
