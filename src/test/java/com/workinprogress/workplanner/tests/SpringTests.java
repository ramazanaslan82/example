package com.workinprogress.workplanner.tests;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.workinprogress.workplanner.event.LocationSaveEvent;
import com.workinprogress.workplanner.model.City;
import com.workinprogress.workplanner.model.User;
import com.workinprogress.workplanner.service.CityService;
import com.workinprogress.workplanner.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:appcontext/beans-*.xml"})
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
		User user = new User();
		user.setFirstName("Ramazan");
		user.setLastName("ASLAN");
		Long lastInsertId = userService.saveUser(user);
		System.out.println("LastInsertId:"+lastInsertId);
	}

	@Test
	public void loadUser() {
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
		City city = new City(1l, "Adana");
		Long id = cityService.saveCity(city);
		//applicationContext.publishEvent(new LocationSaveEvent(cityService, city));
		System.out.println("city:" + city.toString() + " saved with id:" + id);
	}

}
