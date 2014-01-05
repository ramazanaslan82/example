package com.workinprogress.workplanner.dao;

import com.workinprogress.workplanner.model.User;

public interface UserDao {

	User loadUserOldType(long userId);

	Long saveNewUser(User user);

	Long saveUser(User user);

	User loadUser(Long id);
	
}
