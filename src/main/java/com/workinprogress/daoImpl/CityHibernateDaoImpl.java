package com.workinprogress.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.workinprogress.dao.CityDao;
import com.workinprogress.dao.HibernateUtils;
import com.workinprogress.model.City;

public class CityHibernateDaoImpl implements CityDao {

	@Override
	public Long saveCity(City city) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session sess = sessionFactory.getCurrentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(city);
		System.out.println("City saved.. :"+city.toString());
		sess.flush();
		tx.rollback();
		return city.getId();
	}

}
