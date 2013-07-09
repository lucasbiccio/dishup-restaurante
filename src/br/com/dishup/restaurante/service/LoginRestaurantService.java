package br.com.dishup.restaurante.service;

import org.hibernate.Session;

import br.com.dishup.core.codedata.StatusUsuarioCD;
import br.com.dishup.core.entity.UsuarioRestauranteEntity;
import br.com.dishup.core.exception.DishUpException;
import br.com.dishup.core.exception.EncryptException;
import br.com.dishup.core.exception.FieldValidatorException;
import br.com.dishup.core.exception.UsuarioRestauranteNotFoundException;
import br.com.dishup.core.persistence.HibernateUtil;
import br.com.dishup.core.persistence.UsuarioRestauranteDAO;
import br.com.dishup.core.security.CryptographSecurity;
import br.com.dishup.core.util.FieldValidatorUtil;

public class LoginRestaurantService {
	
	public boolean login(String email, String password) throws FieldValidatorException, DishUpException{
		if(FieldValidatorUtil.isEmpty(email) || FieldValidatorUtil.isEmpty(password))
			throw new FieldValidatorException("CAMPOS E-MAIL OU SENHA NAO FORAM INFORMADOS");
		Session session = HibernateUtil.getSessionFactory().openSession();
		UsuarioRestauranteDAO usuarioRestauranteDAO = new UsuarioRestauranteDAO();
		UsuarioRestauranteEntity usuarioRestaurante;
		boolean login = false;
		try{
			usuarioRestaurante = usuarioRestauranteDAO.selectByEmail(session, email);
			if(usuarioRestaurante.getStatus().getId() != StatusUsuarioCD.ACTIVE.getId())
				throw new DishUpException("USUARIO NAO ESTA ATIVO");
			if(usuarioRestaurante.getAssinatura().equals(CryptographSecurity.encrypt(password)))
				login = true;
		}catch(UsuarioRestauranteNotFoundException e){
			e.printStackTrace();
		}catch (EncryptException e) {
			e.printStackTrace();
		}
		return login;
	}
}
