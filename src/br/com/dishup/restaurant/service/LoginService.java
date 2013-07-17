package br.com.dishup.restaurant.service;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

import br.com.dishup.core.entity.UserRestaurantEntity;
import br.com.dishup.core.exception.DishUpException;
import br.com.dishup.core.exception.EncryptException;
import br.com.dishup.core.exception.UserRestaurantNotFoundException;
import br.com.dishup.core.persistence.HibernateUtil;
import br.com.dishup.core.persistence.UserRestaurantDAO;
import br.com.dishup.core.security.CryptographSecurity;
import br.com.dishup.restaurant.bean.AuthenticationBean;

/**
 * @author Lucas Biccio Ribeiro
 * @since 12/07/2013
 * @version 1.0 Class responsible to encapsulate the user restaurant login service
 */
public class LoginService {
	
	@Autowired
	private MessageSource messageSource;
	
	/**
	 * Service that authenticate the user restaurant
	 * @param authentication object (user and password)
	 * @return true if its authenticated or false if its not
	 * @throws DishUpException when there is expected exception during the login service
	 */
	public boolean autheticateUserRestaurant(AuthenticationBean authentication) throws DishUpException{
		Session session = HibernateUtil.getSessionFactory().openSession();
		UserRestaurantDAO userRestaurantDAO = new UserRestaurantDAO();
		UserRestaurantEntity userRestaurantEntity;
		try{
			userRestaurantEntity = userRestaurantDAO.selectByEmail(session, authentication.getEmail());
			if(userRestaurantEntity.getPassword().equals(CryptographSecurity.encrypt(authentication.getPassword())))
				return true;
		}catch (UserRestaurantNotFoundException e) {
			throw new DishUpException(messageSource.getMessage("service.login.failed", null, null));
		}catch (EncryptException e) {
			//TODO need to implement the log logic
			e.printStackTrace();
			throw new DishUpException(messageSource.getMessage("service.unavailable", null, null));
		}finally{
			session.close();
		}
		return false;
	}
}