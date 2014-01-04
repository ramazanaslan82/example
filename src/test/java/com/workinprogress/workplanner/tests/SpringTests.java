package com.workinprogress.workplanner.tests;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workinprogress.model.City;
import com.workinprogress.model.User;
import com.workinprogress.service.CityService;
import com.workinprogress.service.UserService;

public class SpringTests {

	@Test
	public void testGetUser() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "appcontext/beans-dao.xml",
						"appcontext/beans-service.xml" });
		UserService userService = applicationContext.getBean("userService",
				UserService.class);
		User user = userService.loadById(1l);
		System.out.println("user:" + user.toString());
	}

	@Test
	public void testSaveCity() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				new String[] { "appcontext/beans-dao.xml",
						"appcontext/beans-service.xml" });
		CityService cityService = applicationContext.getBean("cityService",
				CityService.class);
		City city = new City(1l, "Adana");
		Long id = cityService.saveCity(city);
		System.out.println("city:" + city.toString()+" saved with id:"+id);
	}
}
