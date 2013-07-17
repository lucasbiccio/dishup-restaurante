package br.com.dishup.restaurant.validator;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import br.com.dishup.core.util.FieldValidatorUtil;
import br.com.dishup.restaurant.bean.SignUpBean;

/**
 * @author Lucas Biccio Ribeiro
 * @since 14/07/2013
 * @version 1.0 Class responsible to encapsulate the sign up validation
 */
@Component
public class SignUpValidator {
	
	@Autowired
	private MessageSource messageSource;
	
	/**
	 * Method responsible to validate the sign up object
	 * @param signUpBean
	 * @return
	 */
	public Map<String, String> signUpValidator(SignUpBean signUpBean){
		Map<String, String> mapErrors = new HashMap<String, String>();
		if(!FieldValidatorUtil.isValidEmail(signUpBean.getEmail()))
			mapErrors.put("emailError", messageSource.getMessage("signup.field.email.invalid", null, null));
		if(!FieldValidatorUtil.isValidPassword(signUpBean.getPassword()))
			mapErrors.put("passwordError", messageSource.getMessage("signup.field.password.invalid", null, null));
		if(!signUpBean.getPassword().equals(signUpBean.getConfirmPassword()))
			mapErrors.put("passwordConfirmationError", messageSource.getMessage("signup.field.passwordConfirmation.invalid", null, null));
		return mapErrors;
	}
}