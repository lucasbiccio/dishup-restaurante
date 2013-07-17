package br.com.dishup.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import br.com.dishup.core.entity.RestaurantEntity;
import br.com.dishup.core.exception.RestaurantNotFoundException;
import br.com.dishup.core.persistence.HibernateUtil;
import br.com.dishup.core.persistence.RestaurantDAO;
import br.com.dishup.restaurant.bean.RestaurantItemBean;

@Component
public class FindRestaurantService {
	
	public List<RestaurantItemBean> getListRestaurantByUserEmail(String userEmail){
		List<RestaurantItemBean> lisRestaurantItemBean = new ArrayList<RestaurantItemBean>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		try{
			RestaurantDAO restaurantDAO = new RestaurantDAO();
			List<RestaurantEntity> listRestaurantEntity = restaurantDAO.selectByUserRestaurant(session, userEmail);
			for (RestaurantEntity restaurantEntity : listRestaurantEntity) {
				lisRestaurantItemBean.add(new RestaurantItemBean(restaurantEntity.getId(), restaurantEntity.getSocialReason()));
			}
		}catch (RestaurantNotFoundException e) {
			//do nothing, because there is no register found to this query
		}finally{
			session.close();
		}
		return lisRestaurantItemBean;
	}
}