package com.workinprogress.workplanner.daoImpl;

import java.util.List;

import org.hibernate.SessionFactory;
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
		// TODO Auto-generated method stub
		return null;
	}

}
