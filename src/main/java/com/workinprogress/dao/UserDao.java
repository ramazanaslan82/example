package com.workinprogress.dao;

import com.workinprogress.model.User;

public interface UserDao {

	User loadUser(long userId);

	Long saveNewUser(User user);
	
}
