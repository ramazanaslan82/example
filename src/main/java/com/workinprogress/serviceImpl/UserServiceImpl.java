package com.workinprogress.serviceImpl;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;

import com.workinprogress.dao.UserDao;
import com.workinprogress.model.User;
import com.workinprogress.service.UserService;

//@Service
public class UserServiceImpl implements UserService {

	//@Autowired
	private UserDao userDao;
	
	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public User loadById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
