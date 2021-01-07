package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@Autowired
	private LoginRepository loginRepository;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String login(Model model) {
		return "login";
	}
	
	@RequestMapping(value="/loginok", method=RequestMethod.POST)
	public String loginok(HttpServletRequest request, Model model) {
		String usermail = request.getParameter("usermail");
		String password = request.getParameter("password");
		System.out.println(usermail);
		System.out.println(password);
		if(usermail == "" || password == "") {
			return "login";
		}else {
			Account account = loginRepository.findByUsermailAndUserpass(usermail, password);
			System.out.println(account);
			if(account == null) {
				return "login";
			}else {
				session.setAttribute("account", account);
//				model.addAttribute("account", account);
//				System.out.println(account);
				return "loginok";
			}
		}
		
	}
}
