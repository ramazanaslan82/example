package com.workinprogress.workplanner.daoTests;

import org.junit.Test;

import com.workinprogress.workplanner.dao.UserDao;
import com.workinprogress.workplanner.hibernateDao.UserHibernateDaoImpl;
import com.workinprogress.workplanner.model.Address;
import com.workinprogress.workplanner.model.City;
import com.workinprogress.workplanner.model.Country;
import com.workinprogress.workplanner.model.Town;
import com.workinprogress.workplanner.model.User;
import com.workinprogress.workplanner.model.UserProfile;
import com.workinprogress.workplanner.model.UserStatus;

public class UserHibernateDaoTests {

	@Test
	public void loadUserTest()
	{
		UserDao userDao = new UserHibernateDaoImpl();
		User user = userDao.loadUserOldType(1L);
		System.out.println("Loaded user:" + user);
	}
	
	@Test
	public void saveNewUserTest()
	{
		UserDao userDao = new UserHibernateDaoImpl();
		User user = new User();
		user.setUsername("ramazana");
		user.setUserProfile(UserProfile.ADMIN);
		user.setFirstName("Ramazan");
		user.setLastName("ASLAN");
		user.setPasswordHash("ascdefgh");
		user.setStatus(UserStatus.ACTIVE);
		
		Address address = new Address();
		address.setCountry(new Country(1L, "Türkiye"));
		address.setCity(new City(34L, "Adana"));
		address.setTown(new Town(1111L, "Avcılar"));
		address.setPostalCode("12345");
		user.setAddress(address);
		
		userDao.saveNewUser(user);
		System.out.println("User saved with id:"+user.getId());
	}
}
