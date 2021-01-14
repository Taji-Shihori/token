package com.example.demo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="account")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="user_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="user_name1")
	private String username1;
	
	@Column(name="user_name2")
	private String username2;
	
	@Column(name="user_furi1")
	private String userfuri1;
	
	@Column(name="user_furi2")
	private String userfuri2;
	
	@Column(name="user_mail")
	private String usermail;
	
	@Column(name="user_pass")
	private String userpass;
	
	@Column(name="user_adress1")
	private String useradress1;
	
	@Column(name="user_adress2")
	private String useradress2;
	
	@Column(name="user_birth")
	private String userbirth;
	
	@Column(name="yubin")
	private String yubin;
	
	@Column(name="user_btype")
	private String userbtype;
	
	@Column(name="user_tel")
	private String usertel;
	
	@Override
	public String toString() {
		return "Account [id=" + id + ", username1=" + username1 + ", username2=" + username2 + ", userfuri1="
				+ userfuri1 + ", userfuri2=" + userfuri2 + ", usermail=" + usermail + ", userpass=" + userpass
				+ ", useradress1=" + useradress1 + ", useradress2=" + useradress2 + ", userbirth=" + userbirth
				+ ", yubin=" + yubin + ", userbtype=" + userbtype + ", usertel=" + usertel + "]";
	}
	public Long getId() {
		return id;
	}
	public String getUsername1() {
		return username1;
	}
	public String getUsername2() {
		return username2;
	}
	public String getUserfuri1() {
		return userfuri1;
	}
	public String getUserfuri2() {
		return userfuri2;
	}
	public String getUsermail() {
		return usermail;
	}
	public String getUserpass() {
		return userpass;
	}
	public String getUseradress1() {
		return useradress1;
	}
	public String getUseradress2() {
		return useradress2;
	}
	public String getUserbirth() {
		return userbirth;
	}
	public String getYubin() {
		return yubin;
	}
	public String getUserbtype() {
		return userbtype;
	}
	public String getUsertel() {
		return usertel;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setUsername1(String username1) {
		this.username1 = username1;
	}
	public void setUsername2(String username2) {
		this.username2 = username2;
	}
	public void setUserfuri1(String userfuri1) {
		this.userfuri1 = userfuri1;
	}
	public void setUserfuri2(String userfuri2) {
		this.userfuri2 = userfuri2;
	}
	public void setUsermail(String usermail) {
		this.usermail = usermail;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public void setUseradress1(String useradress1) {
		this.useradress1 = useradress1;
	}
	public void setUseradress2(String useradress2) {
		this.useradress2 = useradress2;
	}
	public void setUserbirth(String userbirth) {
		this.userbirth = userbirth;
	}
	public void setYubin(String yubin) {
		this.yubin = yubin;
	}
	public void setUserbtype(String userbtype) {
		this.userbtype = userbtype;
	}
	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}
	
	

}
