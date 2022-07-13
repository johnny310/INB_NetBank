package com.mindgate.main.pojo;

public class UserLogin {

	private String userId;
	private String password;
	private String role;

	public UserLogin() {
		
	}

	public UserLogin(String userId, String password, String role) {
		super();
		this.userId = userId;
		this.password = password;
		this.role = role;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "UserLogin [userId=" + userId + ", password=" + password + ", role=" + role + "]";
	}

}
