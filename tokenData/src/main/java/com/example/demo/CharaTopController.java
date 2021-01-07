package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CharaTopController {
	
	@Autowired
	private CharaTopRepository charatopRepository;
	
	@RequestMapping(value="/char", method=RequestMethod.GET)
	public String charaMain(Model model) {
//		List<Chara> charList = charatopRepository.findAll();
		List<Chara> charList = charatopRepository.findAllByOrderByIdDesc();
		model.addAttribute("charList", charList);
		System.out.println(charList);
		return "charaMain";
	}

}