package com.workinprogress.workplanner.serviceImpl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.workinprogress.workplanner.dao.CityDao;
import com.workinprogress.workplanner.model.City;
import com.workinprogress.workplanner.service.LocationService;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private CityDao cityDao;
	
	public LocationServiceImpl() {
		super();
	}

	public LocationServiceImpl(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}
	
	public Long saveNewCity(City city)
	{
		return cityDao.saveCity(city);
	}

	@Override
	@Transactional
	public Long saveCity(City city) {
		Long id = cityDao.saveCity(city);
		return id;
	}

	@Override
	public Collection<City> loadCities() {
		return cityDao.loadCities();
	}

}
