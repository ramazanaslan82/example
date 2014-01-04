package com.workinprogress.serviceImpl;

import com.workinprogress.dao.CityDao;
import com.workinprogress.model.City;
import com.workinprogress.service.CityService;

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
