package com.workinprogress.workplanner.dao;

import java.util.Collection;

import com.workinprogress.workplanner.model.City;

public interface CityDao {
	Long saveCity(City city);

	Collection<City> loadCities();
}
