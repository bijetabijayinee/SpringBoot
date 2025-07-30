package com.hcl.service;

import org.springframework.stereotype.Service;

import com.hcl.bean.LoginBean;

@Service
public class LoginService {
	public boolean validate(LoginBean bean) {
		return bean.getUserName().equalsIgnoreCase(bean.getPassword());
	}
}
