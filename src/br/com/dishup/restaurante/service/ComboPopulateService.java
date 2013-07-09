package br.com.dishup.restaurante.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import br.com.dishup.core.entity.CargoEntity;
import br.com.dishup.core.entity.PaisEntity;
import br.com.dishup.core.entity.TipoCulinariaEntity;
import br.com.dishup.core.exception.EmptyTableException;
import br.com.dishup.core.persistence.CargoDAO;
import br.com.dishup.core.persistence.HibernateUtil;
import br.com.dishup.core.persistence.PaisDAO;
import br.com.dishup.core.persistence.TipoCulinariaDAO;
import br.com.dishup.restaurante.bean.CountryBean;
import br.com.dishup.restaurante.bean.CulinaryTypeBean;
import br.com.dishup.restaurante.bean.EmploymentTypeBean;

public class ComboPopulateService {

	public ArrayList<CulinaryTypeBean> getCulinaryTypeList(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		TipoCulinariaDAO tipoCulinariaDAO = new TipoCulinariaDAO();
		ArrayList<CulinaryTypeBean> listTipoCulinaria = new ArrayList<CulinaryTypeBean>();
		try{
			List<TipoCulinariaEntity> list = tipoCulinariaDAO.selectAllOrderById(session);
			for (TipoCulinariaEntity tipoCulinariaEntity : list) {
				listTipoCulinaria.add(new CulinaryTypeBean(tipoCulinariaEntity.getId(), tipoCulinariaEntity.getNome()));
			}
			return listTipoCulinaria;
		}catch (EmptyTableException e) {
			return listTipoCulinaria;
		}
	}
	
	public ArrayList<EmploymentTypeBean> getEmploymentTypeList(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		CargoDAO cargoDAO = new CargoDAO();
		ArrayList<EmploymentTypeBean> listEmploymentTypeBean = new ArrayList<EmploymentTypeBean>();
		try{
			List<CargoEntity> list = cargoDAO.selectAllOrderById(session);
			for (CargoEntity cargoEntity : list) {
				listEmploymentTypeBean.add(new EmploymentTypeBean(cargoEntity.getId(), cargoEntity.getNome()));
			}
			return listEmploymentTypeBean;
		}catch (EmptyTableException e) {
			return listEmploymentTypeBean;
		}
	}
	
	public ArrayList<CountryBean> getCountryList(){
		Session session = HibernateUtil.getSessionFactory().openSession();
		PaisDAO paisDAO = new PaisDAO();
		ArrayList<CountryBean> listCountry = new ArrayList<CountryBean>();
		try{
			List<PaisEntity> list = paisDAO.selectAllOrderById(session);
			for (PaisEntity paisEntity : list) {
				listCountry.add(new CountryBean(paisEntity.getId(), paisEntity.getNome()));
			}
			return listCountry;
		}catch (EmptyTableException e) {
			return listCountry;
		}
	}
}