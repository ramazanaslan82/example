package com.workinprogress.workplanner.daoImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.workinprogress.workplanner.dao.CityDao;
import com.workinprogress.workplanner.dao.HibernateUtils;
import com.workinprogress.workplanner.model.City;

public class CityHibernateDaoImpl implements CityDao {

	@Override
	public Long saveCity(City city) {
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session sess = sessionFactory.getCurrentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(city);
		System.out.println("City saved.. :"+city.toString());
		sess.flush();
		tx.commit();
		return city.getId();
	}

}
