package com.workinprogress.workplanner.tests;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.workinprogress.workplanner.model.City;
import com.workinprogress.workplanner.model.User;
import com.workinprogress.workplanner.service.CityService;
import com.workinprogress.workplanner.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:appcontext/beans-*.xml"})
@Transactional
@TransactionConfiguration(defaultRollback=false)
public class SpringTests {

	@Autowired
	private CityService cityService;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testGetUser() {
		User user = userService.loadById(1l);
		System.out.println("user:" + user.toString());
	}
	
	@Test
	public void testSaveUser() {
		System.out.println("Method started...");
		User user = new User();
		user.setFirstName("Ramazan");
		user.setLastName("ASLAN");
		Long lastInsertId = userService.saveUser(user);
		System.out.println("User saved with id :"+lastInsertId);
		System.out.println("LastInsertId:"+lastInsertId);
		System.out.println("Method finished...");
	}

	@Test
	public void loadUser() {
		System.out.println("Loading user:1");
		User user = userService.loadUser(1l);
		System.out.println("Loaded user:"+user);
	}

	@Test
	public void testLoadCities()
	{
		Collection<City> cities = cityService.loadCities();
		System.out.println(cities.size() + " adet sehir yuklendi..");
	}
	
	@Test
	public void testSaveCity() {
		City city = new City(3l, "Afyon");
		Long id = cityService.saveCity(city);
		//applicationContext.publishEvent(new LocationSaveEvent(cityService, city));
		System.out.println("city:" + city.toString() + " saved with id:" + id);
	}

}
