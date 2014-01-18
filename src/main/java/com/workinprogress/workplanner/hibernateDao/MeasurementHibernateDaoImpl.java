package com.workinprogress.workplanner.hibernateDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workinprogress.workplanner.dao.MeasurementDao;
import com.workinprogress.workplanner.model.Measurement;

@Repository
public class MeasurementHibernateDaoImpl implements MeasurementDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long saveMeasurement(Measurement measurement) {
		sessionFactory.getCurrentSession().save(measurement);
		return measurement.getId();
	}

	@Override
	public List<Measurement> loadMeasurements() {
		DetachedCriteria detachedCriteria = DetachedCriteria
				.forClass(Measurement.class);
		detachedCriteria.addOrder(Order.asc("id"));
		Criteria criteria = detachedCriteria
				.getExecutableCriteria(sessionFactory.getCurrentSession());
		return (List<Measurement>) criteria.list();
	}

}
