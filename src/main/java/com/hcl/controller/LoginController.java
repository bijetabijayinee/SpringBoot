package com.hcl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.bean.LoginBean;
import com.hcl.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService service;

	@GetMapping("/")
	public String showDefaultpage() {
		System.out.println("Root");
		return "index";
	}
	
	@GetMapping("/login")
	public String showLoginpage(@ModelAttribute("login") LoginBean loginBean) {
		System.out.println("Login Controller" + loginBean);
		return "login";
	}
	
	@ModelAttribute("login")
	public LoginBean defaultLoginData() {
		return new LoginBean();
	}

	@RequestMapping(value = "/submitlogin", method = RequestMethod.POST)
	public String checkLoginDetails(@ModelAttribute("login") LoginBean loginBean) {

		return service.validate(loginBean) ? "success" : "failure";
	}
}

