package br.com.dishup.restaurant.validator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import br.com.dishup.core.util.FieldValidatorUtil;
import br.com.dishup.restaurant.bean.RestaurantBasicInfoBean;

@Component
public class RestaurantBasicInfoValidator {
	
	@Autowired
	private MessageSource messageSource;
	
	public Map<String, String> validateRestaurantBasicInfo(RestaurantBasicInfoBean bean){
		Map<String, String> mapError = new HashMap<String, String>();
		if(!FieldValidatorUtil.isValidCNPJ(bean.getCNPJroot(), bean.getCNPJfilial(), bean.getCNPJcontrol()));
			mapError.put("cnpjError", messageSource.getMessage("key", null, null));
		if(FieldValidatorUtil.isEmpty(bean.getSocialReason()))
			mapError.put("socialReasonError", messageSource.getMessage("key", null, null));
		if(!FieldValidatorUtil.isValidDDD(bean.getDddTephone()))
			mapError.put("dddTelephoneError", messageSource.getMessage("key", null, null));
		if(!FieldValidatorUtil.isValidTelephone(bean.getTelephone()))
			mapError.put("telephoneError", messageSource.getMessage("key", null, null));
		return null;
	}
}