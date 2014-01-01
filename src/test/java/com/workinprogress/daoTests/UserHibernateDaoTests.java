package com.workinprogress.daoTests;

import org.junit.Test;

import com.workinprogress.dao.UserDao;
import com.workinprogress.hibernateDaoImpl.UserHibernateDaoImpl;
import com.workinprogress.model.Address;
import com.workinprogress.model.City;
import com.workinprogress.model.Country;
import com.workinprogress.model.Town;
import com.workinprogress.model.User;
import com.workinprogress.model.UserProfile;
import com.workinprogress.model.UserStatus;

public class UserHibernateDaoTests {

	@Test
	public void loadUserTest()
	{
		UserDao userDao = new UserHibernateDaoImpl();
		User user = userDao.loadUser(1L);
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
