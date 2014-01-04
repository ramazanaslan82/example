package com.workinprogress.workplanner.serviceImpl;

import com.workinprogress.workplanner.dao.CityDao;
import com.workinprogress.workplanner.model.City;
import com.workinprogress.workplanner.service.CityService;

public class CityServiceImpl implements CityService {

	private CityDao cityDao;

	public CityServiceImpl(CityDao cityDao) {
		super();
		this.cityDao = cityDao;
	}

	@Override
	public Long saveCity(City city) {
		return cityDao.saveCity(city);
	}

}
