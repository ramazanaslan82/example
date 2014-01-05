package com.workinprogress.workplanner.serviceImpl;

import java.util.Collection;

import org.aspectj.weaver.patterns.ThisOrTargetAnnotationPointcut;
import org.hibernate.SessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import com.workinprogress.workplanner.dao.CityDao;
import com.workinprogress.workplanner.event.LocationSaveEvent;
import com.workinprogress.workplanner.model.City;
import com.workinprogress.workplanner.service.CityService;

@Service(value = "cityService")
public class CityServiceImpl implements CityService, ApplicationContextAware {

	@Autowired
	private CityDao cityDao;
	
	private ApplicationContext applicationContext;

	public CityServiceImpl() {
		super();
	}

	public CityServiceImpl(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Long saveCity(City city) {
		Long id = cityDao.saveCity(city);
		return id;
	}

	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
		this.applicationContext = arg0;
	}

	@Override
	public Collection<City> loadCities() {
		return cityDao.loadCities();
	}

}
