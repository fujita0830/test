package com.internousdev.webproj.action;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private String username1;
	private String password;

	public String executre(){
		return SUCCESS;
	}

	public String getUsername(){
		return username1;
	}

	public void setUsername(String username){
		this.username1=username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password){
		this.password=password;
	}

}