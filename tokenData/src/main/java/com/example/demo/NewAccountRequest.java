package com.example.demo;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class NewAccountRequest implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@NotEmpty(message = "「姓」を入力してください")
	private String username1;
	
	@NotEmpty(message = "「名」を入力してください")
	private String username2;
	
	@NotEmpty(message = "「ふりがな(姓)」を入力してください")
	private String userfuri1;
	
	@NotEmpty(message = "「ふりがな(名)」を入力してください")
	private String userfuri2;
	
	@Email
	@NotEmpty(message = "「メールアドレス」を入力してください")
	@Pattern(regexp = "^([\\w])+([\\w\\._-])*\\@([\\w])+([\\w\\._-])*\\.([a-zA-Z])+$")
	private String usermail;
	
	@NotEmpty(message = "「パスワード」を入力してください")
	@Size(min = 4,max = 10, message = "「パスワード」は4桁以上10桁以内で入力してください")
	private String userpass;
	
	private String useradress1;
	
	private String useradress2;
	
	@Pattern(regexp = "^\\d{4}([/\\-. ])((0?[13578]|1[02])\\1(0?[1-9]|[12][0-9]|3[01])|0?2\\1(0?[1-9]|[12][0-9])|(0?[469]|11)\\1(0?[1-9]|[12][0-9]|30))$", 
						message = "「生年月日」はYYYY/MM/DDの形式で入力してください")
	private String userbirth;
	
	@Pattern(regexp = "^\\d{3}\\d{4}$", message = "「郵便番号」は数字7桁で入力してください")
	private String yubin;
	
	@Pattern(regexp = "^0[5789]0\\d{8}$", message = "「電話番号」は11桁で入力してください")
	private String usertel;
	
	private String userbtype;

	@Override
	public String toString() {
		return "NewAccountRequest [username1=" + username1 + ", username2=" + username2 + ", userfuri1=" + userfuri1
				+ ", userfuri2=" + userfuri2 + ", usermail=" + usermail + ", userpass=" + userpass + ", useradress1="
				+ useradress1 + ", useradress2=" + useradress2 + ", userbirth=" + userbirth + ", yubin=" + yubin
				+ ", usertel=" + usertel + ", userbtype=" + userbtype + "]";
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

	public String getUsertel() {
		return usertel;
	}

	public String getUserbtype() {
		return userbtype;
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

	public void setUsertel(String usertel) {
		this.usertel = usertel;
	}

	public void setUserbtype(String userbtype) {
		this.userbtype = userbtype;
	}

}
