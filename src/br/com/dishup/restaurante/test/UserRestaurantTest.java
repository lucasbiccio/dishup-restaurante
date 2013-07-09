package br.com.dishup.restaurante.test;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.Transaction;
import br.com.dishup.core.entity.UsuarioRestauranteEntity;
import br.com.dishup.core.exception.EncryptException;
import br.com.dishup.core.exception.StatusUsuarioNotFoundException;
import br.com.dishup.core.persistence.HibernateUtil;
import br.com.dishup.core.persistence.StatusUsuarioDAO;
import br.com.dishup.core.persistence.UsuarioRestauranteDAO;
import br.com.dishup.core.security.CryptographSecurity;

public class UserRestaurantTest {

	public static void main(String[] args) throws StatusUsuarioNotFoundException, EncryptException {
		UserRestaurantTest test = new UserRestaurantTest();
		test.signUpUsuarioRestaurante("lucasbiccio@gmail.com", "1234", 1);
	}
	
	public void signUpUsuarioRestaurante(String email, String password, int statusUsuario) throws StatusUsuarioNotFoundException, EncryptException{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		StatusUsuarioDAO statusUsuarioDAO = new StatusUsuarioDAO();
		UsuarioRestauranteDAO usuarioRestauranteDAO = new UsuarioRestauranteDAO();
		UsuarioRestauranteEntity usuarioRestauranteEntity = 
				new UsuarioRestauranteEntity(0, email, CryptographSecurity.encrypt(password), statusUsuarioDAO.selectById(session, statusUsuario), new Date());
		usuarioRestauranteDAO.insert(session, usuarioRestauranteEntity);
		transaction.commit();
	}
}
