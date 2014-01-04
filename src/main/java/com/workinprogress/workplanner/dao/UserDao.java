package com.workinprogress.workplanner.dao;

import com.workinprogress.workplanner.model.User;

public interface UserDao {

	User loadUser(long userId);

	Long saveNewUser(User user);
	
}
