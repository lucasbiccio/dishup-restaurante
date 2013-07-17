package br.com.dishup.restaurant.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dishup.restaurant.bean.SessionAttributeBean;
import br.com.dishup.restaurant.service.FindRestaurantService;

@Controller
public class ManagerRestaurantController {

	@Autowired
	private FindRestaurantService findRestaurantService;
	
	@RequestMapping(value="managerRestaurant")
	public String doGetManagerRestaurantView(HttpSession httpSession, Model model){
		SessionAttributeBean sessionAttributeBean = (SessionAttributeBean) httpSession.getAttribute("sessionDishUp");
		model.addAttribute("userName", sessionAttributeBean.getUserEmail());
		model.addAttribute("listRestaurant", findRestaurantService.getListRestaurantByUserEmail(sessionAttributeBean.getUserEmail()));
		return "frmManagerRestaurant";
	}
}
