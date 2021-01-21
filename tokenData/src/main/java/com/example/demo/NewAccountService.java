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
	
//	private Account createAccount(NewAccountRequest newAccountRequest) {
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
//		System.out.println(account);
//		return account;

}
