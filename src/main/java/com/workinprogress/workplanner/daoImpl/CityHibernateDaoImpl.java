package com.workinprogress.workplanner.daoImpl;

import java.util.Collection;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workinprogress.workplanner.dao.CityDao;
import com.workinprogress.workplanner.model.City;

@Repository
public class CityHibernateDaoImpl implements CityDao {

	//@Autowired
	//private JdbcTemplate jdbcTemplate;
	
	// Do not autowire..
	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long saveCity(City city) {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(City.class);
		Criteria criteria = detachedCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
		City newCityObject = (City)	criteria.uniqueResult();
		return newCityObject.getId();
		
		/*
		SessionFactory sessionFactory = HibernateUtils.getSessionFactory();
		Session sess = sessionFactory.getCurrentSession();
		Transaction tx = sess.beginTransaction();
		sess.save(city);
		System.out.println("City saved.. :" + city.toString());
		sess.flush();
		tx.commit();
		return city.getId();
		*/
	}

	@Override
	public Collection<City> loadCities() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(City.class);
		detachedCriteria.add(Restrictions.ge("id", 0l));
		detachedCriteria.addOrder(Order.asc("id"));
		Criteria criteria = detachedCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
		return (Collection<City>) criteria.list();
		/*
		return jdbcTemplate.query("select * from hbn_location", new RowMapper<City>() {

			@Override
			public City mapRow(ResultSet rs, int rowNum) throws SQLException {
				City city = new City();
				city.setId(rs.getLong("id"));
				city.setTitle(rs.getNString("title"));
				return city;
			}

		});
		return null;
		*/
	}

}
