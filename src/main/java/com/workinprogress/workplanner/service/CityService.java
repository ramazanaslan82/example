package com.workinprogress.workplanner.service;

import java.util.Collection;

import com.workinprogress.workplanner.model.City;

public interface CityService {
	Long saveCity(City city);
	
	Collection<City> loadCities();
}
