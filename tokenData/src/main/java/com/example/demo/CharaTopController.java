package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
		List<Chara> charList = charatopRepository.findAll();
		model.addAttribute("charList", charList);
		System.out.println(charList);
		return "charaMain";
	}
	
	@RequestMapping(value="/sort", method=RequestMethod.POST)
	public String Sort(HttpServletRequest request, Model model) {
		String tochosort = request.getParameter("tochosort");
		String namesort = request.getParameter("namesort");
		String raresort1 = request.getParameter("raresort1");
		String raresort2 = request.getParameter("raresort2");
		if(tochosort != null) {
			List<Chara> charList = charatopRepository.findAllByOrderByBangAsc();
			model.addAttribute("charList", charList);
			return "charaMain";
		}else if(namesort != null) {
			List<Chara> charList = charatopRepository.findAllByOrderByCharFuriAsc();
			model.addAttribute("charList", charList);
			return "charaMain";
		}else if(raresort1 != null) {
			List<Chara> charList = charatopRepository.findAllByOrderByRareDesc();
			model.addAttribute("charList", charList);
			return "charaMain";
		}else if(raresort2 != null) {
			List<Chara> charList = charatopRepository.findAllByOrderByRareAsc();
			model.addAttribute("charList", charList);
			return "charaMain";
		}else {
		return "charaMain";
		}
	}

}
