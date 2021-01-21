package com.example.demo;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NewAccountController {
	
	@Autowired
	NewAccountService newAccountService;
	
	@Autowired
	private NewAccountRepository newAccountRepository;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/newaccount", method=RequestMethod.GET)
	public String newAccount(Model model) {
		model.addAttribute("newAccountRequest", new NewAccountRequest());
		return "newaccount";
	}
	
	@RequestMapping(value="/newAccountTest", method=RequestMethod.POST)
	public String newAccountTest(@Validated @ModelAttribute NewAccountRequest newAccountRequest, BindingResult result, HttpServletRequest request, Model model) {
		String username1 = request.getParameter("username1");
		String username2 = request.getParameter("username2");
		String userfuri1 = request.getParameter("userfuri1");
		String userfuri2 = request.getParameter("userfuri2");
		String usermail = request.getParameter("usermail");
		String userpass = request.getParameter("userpass");
		String userbirth = request.getParameter("userbirth");
		String userbtype = request.getParameter("userbtype");
		String usertel = request.getParameter("usertel");
		String yubin = request.getParameter("yubin");
		String useradress1 = request.getParameter("useradress1");
		String useradress2 = request.getParameter("useradress2");
		System.out.print(username1);
		System.out.print(username2);
		System.out.print(userfuri1);
		System.out.print(userfuri2);
		System.out.print(usermail);
		System.out.print(userpass);
		System.out.print(userbirth);
		System.out.print(userbtype);
		System.out.print(usertel);
		System.out.print(yubin);
		System.out.print(useradress1);
		System.out.println(useradress2);
		
		if(result.hasErrors()) {
			return "newaccount";
			}
		
		request.setAttribute("username1", username1);
		request.setAttribute("username2", username2);
		request.setAttribute("userfuri1", userfuri1);
		request.setAttribute("userfuri2", userfuri2);
		request.setAttribute("usermail", usermail);
		request.setAttribute("userpass", userpass);
		request.setAttribute("userbirth", userbirth);
		request.setAttribute("userbtype", userbtype);
		request.setAttribute("usertel", usertel);
		request.setAttribute("yubin", yubin);
		request.setAttribute("useradress1", useradress1);
		request.setAttribute("useradress2", useradress2);
		return "newAccountTest";
		
	}
	
	@RequestMapping(value="/newAccountok", method=RequestMethod.POST)
	public String create(@ModelAttribute NewAccountRequest newAccountRequest, HttpServletRequest request, Model model) {
		newAccountService.create(newAccountRequest);
		System.out.println(newAccountRequest);
		String usermail = request.getParameter("usermail");
		Account account = newAccountRepository.findByUsermail(usermail);
		session.setAttribute("account", account);
		System.out.println(account);
		return "newAccountok";
	}

}
