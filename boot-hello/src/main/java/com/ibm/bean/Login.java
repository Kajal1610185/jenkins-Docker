package com.ibm.bean;

import org.springframework.stereotype.Component;

@Component
public class Login {
	private String userid;
	private String passwd;
	
	public Login() {
		// TODO Auto-generated constructor stub
	}
	
	public Login(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}

	//Getter and setters
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	

	

}
