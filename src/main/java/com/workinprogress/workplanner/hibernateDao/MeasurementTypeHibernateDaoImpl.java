package com.workinprogress.workplanner.hibernateDao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.workinprogress.workplanner.dao.MeasurementTypeDao;
import com.workinprogress.workplanner.model.MeasurementType;

@Repository
public class MeasurementTypeHibernateDaoImpl implements MeasurementTypeDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public Long saveMeasurementType(MeasurementType measurementType) {
		sessionFactory.getCurrentSession().save(measurementType);
		return measurementType.getId();
	}

	@Override
	public List<MeasurementType> loadTypes() {
		DetachedCriteria detachedCriteria = DetachedCriteria.forClass(MeasurementType.class);
		detachedCriteria.addOrder(Order.asc("id"));
		Criteria criteria = detachedCriteria.getExecutableCriteria(sessionFactory.getCurrentSession());
		return (List<MeasurementType>) criteria.list();
	}

}
