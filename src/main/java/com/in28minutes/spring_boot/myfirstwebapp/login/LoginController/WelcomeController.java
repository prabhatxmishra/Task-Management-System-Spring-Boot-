package com.in28minutes.spring_boot.myfirstwebapp.login.LoginController;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class WelcomeController {
	
	AuthService auth;
	
	public WelcomeController(AuthService auth) {
		super();
		this.auth = auth;
	}

	//login -> http://localhost:8081/login?name=Prabhat
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String gotoWelcomePageJsp(ModelMap model)
	{
		model.put("name",getLoggedinUsername());
		return "welcome";
	}

	private String getLoggedinUsername() {
		
		@Nullable
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
}
