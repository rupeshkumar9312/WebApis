package com.sms.student;

public class AdminLogin {

	private String username;
	private String password;
	
	public AdminLogin() {
		// TODO Auto-generated constructor stub
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminLogin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
