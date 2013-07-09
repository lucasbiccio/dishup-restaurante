package br.com.dishup.restaurante.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import br.com.dishup.core.exception.DishUpException;
import br.com.dishup.core.exception.FieldValidatorException;
import br.com.dishup.restaurante.bean.AutenticationBean;
import br.com.dishup.restaurante.service.LoginRestaurantService;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String login(AutenticationBean loginBean){
		LoginRestaurantService loginService = new LoginRestaurantService();
		try {
			if(loginService.login(loginBean.getEmail(), loginBean.getPassword()))
				return "home";
		} catch (FieldValidatorException e) {
			System.out.println(e.getMessage());
		} catch (DishUpException e) {
			System.out.println(e.getMessage());
		}
		return "login";
	}

}
