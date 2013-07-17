package br.com.dishup.restaurant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/novo")
	public String novoRestaurante(){
		return "novoRestaurante";
	}
	
	@RequestMapping("/welcome")
	public String getWelcomePage(){
		return "frmLoginRestaurant";
	}
	
	@RequestMapping("/frmSignUpRestaurant")
	public String getFrmSignUpRestaurant(){
		return "frmSignUpRestaurant";
	}
	
}
