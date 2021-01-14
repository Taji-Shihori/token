package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class NewAccountService {
	
	@Autowired
	private NewAccountRepository newAccountRepository;
	
	public List<Account> searchAll(){
		return newAccountRepository.findAll();
	}
	
	public void create(NewAccountRequest newAccountRequest) {
		Account account = new Account();
		account.setUsername1(newAccountRequest.getUsername1());
		account.setUsername2(newAccountRequest.getUsername2());
		account.setUserfuri1(newAccountRequest.getUserfuri1());
		account.setUserfuri2(newAccountRequest.getUserfuri2());
		account.setUsermail(newAccountRequest.getUsermail());
		account.setUserpass(newAccountRequest.getUserpass());
		account.setUseradress1(newAccountRequest.getUseradress1());
		account.setUseradress2(newAccountRequest.getUseradress2());
		account.setUserbirth(newAccountRequest.getUserbirth());
		account.setYubin(newAccountRequest.getYubin());
		account.setUserbtype(newAccountRequest.getUserbtype());
		account.setUsertel(newAccountRequest.getUsertel());
		System.out.println(account);
		newAccountRepository.save(account);
	}
	
	private Account createAccount(NewAccountRequest newAccountRequest) {
		Account account = new Account();
		account.setUsername1(newAccountRequest.getUsername1());
		account.setUsername2(newAccountRequest.getUsername2());
		account.setUserfuri1(newAccountRequest.getUserfuri1());
		account.setUserfuri2(newAccountRequest.getUserfuri2());
		account.setUsermail(newAccountRequest.getUsermail());
		account.setUserpass(newAccountRequest.getUserpass());
		account.setUseradress1(newAccountRequest.getUseradress1());
		account.setUseradress2(newAccountRequest.getUseradress2());
		account.setUserbirth(newAccountRequest.getUserbirth());
		account.setYubin(newAccountRequest.getYubin());
		account.setUserbtype(newAccountRequest.getUserbtype());
		account.setUsertel(newAccountRequest.getUsertel());
		System.out.println(account);
		return account;
		
	}
	
//	public void create(HttpServletRequest request) {
//		
//		String username1 = request.getParameter("username1");
//		String username2 = request.getParameter("username2");
//		String userfuri1 = request.getParameter("userfuri1");
//		String userfuri2 = request.getParameter("userfuri2");
//		String usermail = request.getParameter("usermail");
//		String userpass = request.getParameter("userpass");
//		String userbirth = request.getParameter("userbirth");
//		String userbtype = request.getParameter("userbtype");
//		String usertel = request.getParameter("usertel");
//		String yubin = request.getParameter("yubin");
//		String useradress1 = request.getParameter("useradress1");
//		String useradress2 = request.getParameter("useradress2");
//		System.out.print(username1);
//		System.out.print(username2);
//		System.out.print(userfuri1);
//		System.out.print(userfuri2);
//		System.out.print(usermail);
//		System.out.print(userpass);
//		System.out.print(userbirth);
//		System.out.print(userbtype);
//		System.out.print(usertel);
//		System.out.print(yubin);
//		System.out.print(useradress1);
//		System.out.println(useradress2);
		
//		Account account = new Account();
//		account.setUsername1(newAccountRequest.getUsername1());
//		account.setUsername2(newAccountRequest.getUsername2());
//		account.setUserfuri1(newAccountRequest.getUserfuri1());
//		account.setUserfuri2(newAccountRequest.getUserfuri2());
//		account.setUsermail(newAccountRequest.getUsermail());
//		account.setUserpass(newAccountRequest.getUserpass());
//		account.setUseradress1(newAccountRequest.getUseradress1());
//		account.setUseradress2(newAccountRequest.getUseradress2());
//		account.setUserbirth(newAccountRequest.getUserbirth());
//		account.setYubin(newAccountRequest.getYubin());
//		account.setUserbtype(newAccountRequest.getUserbtype());
//		account.setUsertel(newAccountRequest.getUsertel());
//		newAccountRepository.save(account);
		
//		Account account = new Account();
//		account.setUsername1(username1);
//		account.setUsername2(username2);
//		account.setUserfuri1(userfuri1);
//		account.setUserfuri2(userfuri2);
//		account.setUsermail(usermail);
//		account.setUserpass(userpass);
//		account.setUseradress1(useradress1);
//		account.setUseradress2(useradress2);
//		account.setUserbirth(userbirth);
//		account.setYubin(yubin);
//		account.setUserbtype(userbtype);
//		account.setUsertel(usertel);
//		newAccountRepository.save(account);
//	}

}
