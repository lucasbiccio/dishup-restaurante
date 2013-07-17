package br.com.dishup.restaurant.service;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.NoSuchMessageException;
import org.springframework.stereotype.Component;
import br.com.dishup.core.codedata.UserStatusCD;
import br.com.dishup.core.entity.UserRestaurantEntity;
import br.com.dishup.core.exception.DishUpException;
import br.com.dishup.core.exception.EncryptException;
import br.com.dishup.core.exception.StatusUserNotFoundException;
import br.com.dishup.core.exception.UserRestaurantNotFoundException;
import br.com.dishup.core.persistence.HibernateUtil;
import br.com.dishup.core.persistence.UserRestaurantDAO;
import br.com.dishup.core.persistence.UserStatusDAO;
import br.com.dishup.core.security.CryptographSecurity;
import br.com.dishup.restaurant.bean.SignUpBean;

/**
 * @author Lucas Biccio Ribeiro
 * @since 14/07/2013
 * @version 1.0 Class responsible to encapsulate the restaurant user sign up service.
 */
@Component
public class SignUpService {

	@Autowired
	private MessageSource messageSource;
	
	/**
	 * Service responsible to sign up a restaurant user into system.
	 * @param signUpBean sign up bean object filled up at view layer
	 * @throws DishUpException when there is an expected exception 
	 * handle and returns a special message to view layer
	 */
	public void signUpUserRestaurant(SignUpBean signUpBean) throws DishUpException{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		UserRestaurantDAO userRestaurantDAO = new UserRestaurantDAO();
		UserStatusDAO userStatusDAO = new UserStatusDAO();
		try{
			userRestaurantDAO.selectByEmail(session, signUpBean.getEmail());
			throw new DishUpException(messageSource.getMessage("signup.service.user.alreadyExist", null, null));
		}catch (UserRestaurantNotFoundException e) {
			try{
				UserRestaurantEntity userRestaurantEntity = new UserRestaurantEntity(
							0,
							signUpBean.getEmail(),
							CryptographSecurity.encrypt(signUpBean.getPassword()),
							userStatusDAO.selectById(session, UserStatusCD.ACTIVE.getId()),
							new Date());
				userRestaurantDAO.insert(session, userRestaurantEntity);
				transaction.commit();
			}catch (EncryptException e1) {
				e1.printStackTrace();
				throw new DishUpException(messageSource.getMessage("service.unavailable", null, null));
			}catch (StatusUserNotFoundException e1) {
				e1.printStackTrace();
				throw new DishUpException(messageSource.getMessage("service.unavailable", null, null));
			}
		}catch (NoSuchMessageException e) {
			e.printStackTrace();
		}
		finally{
			session.close();
		}
	}
}