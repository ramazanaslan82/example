package com.workinprogress.workplanner.tests;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.workinprogress.workplanner.model.City;
import com.workinprogress.workplanner.model.User;
import com.workinprogress.workplanner.service.CityService;
import com.workinprogress.workplanner.service.UserService;

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
						"appcontext/beans-service.xml",
						"appcontext/beans-config.xml"});
		CityService cityService = applicationContext.getBean("cityService",
				CityService.class);
		City city = new City(2l, "Adıyaman");
		Long id = cityService.saveCity(city);
		System.out.println("city:" + city.toString()+" saved with id:"+id);
	}
	
}
