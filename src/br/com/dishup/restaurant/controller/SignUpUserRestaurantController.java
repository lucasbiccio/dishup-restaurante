package br.com.dishup.restaurant.controller;

import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import br.com.dishup.core.exception.DishUpException;
import br.com.dishup.restaurant.bean.SessionAttributeBean;
import br.com.dishup.restaurant.bean.SignUpBean;
import br.com.dishup.restaurant.service.SignUpService;
import br.com.dishup.restaurant.validator.SignUpValidator;

/**
 * @author Lucas Biccio Ribeiro
 * @since 14/07/2013
 * @version 1.0 Class responsible to encapsulate the sign up controller process.
 */
@Controller
public class SignUpUserRestaurantController {

	@Autowired
	private SignUpValidator signUpValidator;
	
	@Autowired
	private SignUpService signUpService;
	
	/**
	 * Method responsible to handle the POST request method with sign up uri 
	 * @param signUpBean sign up bean
	 * @param result result binding with errors
	 * @param model object to view
	 * @param httpSession http session
	 * @return redirected view
	 */
	@RequestMapping(value="signUpUserRestaurant", method={RequestMethod.POST})
	public String doPostSignUp(@ModelAttribute(value="signup") SignUpBean signUpBean, Model model, HttpSession httpSession){
		String view = "";
		try{
			Map<String, String> erros = signUpValidator.signUpValidator(signUpBean);
			if(!erros.isEmpty()){
				model.addAllAttributes(erros);
				view = "frmSignUpUserRestaurant";
			}else{
				signUpService.signUpUserRestaurant(signUpBean);
				SessionAttributeBean sessionAttributeBean = new SessionAttributeBean(signUpBean.getEmail());
				httpSession.setAttribute("sessionDishUp", sessionAttributeBean);
				view = "redirect:managerRestaurant";
			}
		}catch(DishUpException e){
			model.addAttribute("msgSignUp", e.getMessage());
			view = "frmSignUpUserRestaurant";
		}
		return view;
	}
	
	/**
	 * Method responsible to handle the GET request method with sign up uri 
	 * @return redirected view
	 */
	@RequestMapping(value="signUpUserRestaurant", method={RequestMethod.GET})
	public String doGetSignUp(@ModelAttribute(value="signup") SignUpBean signUpBean){
		return "frmSignUpUserRestaurant";
	}
}