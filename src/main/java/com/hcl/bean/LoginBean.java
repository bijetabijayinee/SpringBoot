package com.hcl.bean;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginBean {
	private String userName;
	private String password;
	@Override
	public String toString() {
		return "LoginBean [userName=" + userName + ", password=" + password + "]";
	}
	
	
}
