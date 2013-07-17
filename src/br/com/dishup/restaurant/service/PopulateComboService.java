package br.com.dishup.restaurant.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import br.com.dishup.core.entity.CityEntity;
import br.com.dishup.core.entity.CountryEntity;
import br.com.dishup.core.entity.CulinaryTypeEntity;
import br.com.dishup.core.entity.EmploymentEntity;
import br.com.dishup.core.entity.StateEntity;
import br.com.dishup.core.exception.EmptyTableException;
import br.com.dishup.core.persistence.CityDAO;
import br.com.dishup.core.persistence.CountryDAO;
import br.com.dishup.core.persistence.CulinaryTypeDAO;
import br.com.dishup.core.persistence.EmploymentDAO;
import br.com.dishup.core.persistence.HibernateUtil;
import br.com.dishup.core.persistence.StateDAO;
import br.com.dishup.restaurant.bean.CityBean;
import br.com.dishup.restaurant.bean.CountryBean;
import br.com.dishup.restaurant.bean.CulinaryTypeBean;
import br.com.dishup.restaurant.bean.EmploymentTypeBean;
import br.com.dishup.restaurant.bean.StateBean;

/**
 * @author Lucas Biccio Ribeiro
 * @since 11/07/2013
 * @version 1.0 - Class responsible to encapsulate all the services that recover 
 * a specific list into a list of bean to be populate as a drop down box (combo box).
 */
public class PopulateComboService {
	
	/**
	 * Service that return a list of employment type bean to populate a combo
	 * @return list of employment type bean object
	 */
	public List<EmploymentTypeBean> getListEmploymentType(){
		List<EmploymentTypeBean> listEmploymentBean = new ArrayList<EmploymentTypeBean>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		EmploymentDAO employmentDAO = new EmploymentDAO();
		try {
			List<EmploymentEntity> listEmploymentEntity = employmentDAO.selectAllOrderById(session);
			for (EmploymentEntity employmentEntity : listEmploymentEntity) {
				listEmploymentBean.add(new EmploymentTypeBean(employmentEntity.getId(), employmentEntity.getName()));
			}
		} catch (EmptyTableException e) {
			//TODO log implementation
			e.printStackTrace();
		} finally{
			session.close();
		} 
		return listEmploymentBean;
	}
	
	/**
	 * Service that return a list of culinary type bean to populate a combo
	 * @return list of culinary type bean object
	 */
	public List<CulinaryTypeBean> getListCulinatyType(){
		List<CulinaryTypeBean> listCulinaryTypeBean = new ArrayList<CulinaryTypeBean>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		CulinaryTypeDAO culinaryTypeDAO = new CulinaryTypeDAO();
		try{
			List<CulinaryTypeEntity> listCulinaryTypeEntity = culinaryTypeDAO.selectAllOrderById(session);
			for (CulinaryTypeEntity culinaryTypeEntity : listCulinaryTypeEntity) {
				listCulinaryTypeBean.add(new CulinaryTypeBean(culinaryTypeEntity.getId(), culinaryTypeEntity.getName()));
			}
		}catch(EmptyTableException e){
			//TODO log implementation
			e.printStackTrace();
		}finally{
			session.close();
		}
		return listCulinaryTypeBean;
	}
	
	/**
	 * Service that return a list of country bean to populate a combo
	 * @return list of country bean object
	 */
	public List<CountryBean> getListCountry(){
		List<CountryBean> listCountryBean = new ArrayList<CountryBean>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		CountryDAO countryDAO = new CountryDAO();
		try{
			List<CountryEntity> listCountryEntity = countryDAO.selectAllOrderById(session);
			for (CountryEntity countryEntity : listCountryEntity) {
				listCountryBean.add(new CountryBean(countryEntity.getId(), countryEntity.getName()));
			}
		} catch(EmptyTableException e){
			//TODO log implementation
			e.printStackTrace();
		} finally{
			session.close();
		} 
		return listCountryBean;
	}
	
	/**
	 * Service that return a list of state bean by a specific country to populate a combo
	 * @param idCountry country id
	 * @return list of state bean object
	 */
	public List<StateBean> getListStateByCountryId(int idCountry){
		List<StateBean> listStateBean = new ArrayList<StateBean>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		StateDAO stateDAO = new StateDAO();
		try{
			List<StateEntity> listStateEntity = stateDAO.selectByCountryId(session, idCountry);
			for (StateEntity stateEntity : listStateEntity) {
				listStateBean.add(new StateBean(stateEntity.getId(), stateEntity.getName()));
			}
		} catch(EmptyTableException e){
			//TODO log implementation
			e.printStackTrace();
		} finally{
			session.close();
		} 
		return listStateBean;
	}
	
	/**
	 * Service that return a list of city bean by a specific city to populate a combo
	 * @param idState state id
	 * @return list of city bean object
	 */
	public List<CityBean> getListCityByStateId(int idState){
		List<CityBean> listCityBean = new ArrayList<CityBean>();
		Session session = HibernateUtil.getSessionFactory().openSession();
		CityDAO cityDAO = new CityDAO();
		try{
			List<CityEntity> listCityEnity = cityDAO.selectByStateId(session, idState);
			for (CityEntity cityEntity : listCityEnity) {
				listCityBean.add(new CityBean(cityEntity.getId(), cityEntity.getName()));
			}
		}catch(EmptyTableException e){
			//TODO log implementation
			e.printStackTrace();
		} finally{
			session.close();
		} 
		return listCityBean;
	}
}