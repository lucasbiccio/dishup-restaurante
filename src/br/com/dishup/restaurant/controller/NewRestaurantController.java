package br.com.dishup.restaurant.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.dishup.restaurant.bean.RestaurantBean;
import br.com.dishup.restaurant.bean.SessionAttributeBean;
import br.com.dishup.restaurant.service.PopulateComboService;

@Controller
public class NewRestaurantController {
	
	@RequestMapping(value="newRestaurant", method={RequestMethod.GET})
	public String doGetNewRestaurante(@ModelAttribute(value="restarant")RestaurantBean restaurantBean, Model model, HttpSession httpSession){
		PopulateComboService populateComboService = new PopulateComboService();
		SessionAttributeBean sessionBean = (SessionAttributeBean) httpSession.getAttribute("sessionDishUp");
		model.addAttribute("userName", sessionBean.getUserEmail());
		model.addAttribute("culinaryTypeList", populateComboService.getListCulinatyType());
		model.addAttribute("employmentList", populateComboService.getListEmploymentType());
		model.addAttribute("stateList",populateComboService.getListStateByCountryId(1));
		return "frmNewRestaurant";
	}
	
	@RequestMapping(value="newRestaurant", method={RequestMethod.POST})
	public String doPostNewRestaurantBasicInfo(@ModelAttribute(value="restarant")RestaurantBean restaurantBean, Model model){
		
		
		
		return null;
	}
}
