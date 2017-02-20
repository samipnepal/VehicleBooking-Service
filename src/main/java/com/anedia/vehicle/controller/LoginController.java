package com.anedia.vehicle.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.anedia.vehicle.bean.CredentialsBean;

@Controller
@RequestMapping("/login")
public class LoginController {

	@RequestMapping(value="{name}", method = RequestMethod.GET)
	public @ResponseBody CredentialsBean getInfo(@PathVariable String name){
		CredentialsBean cb = new CredentialsBean();
		cb.setLoginStatus(1);
		cb.setPassword("hello");
		cb.setUserType("admin");
		cb.setUserID("323065");
		return cb;
	}

}
