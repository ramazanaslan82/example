package com.workinprogress.workplanner.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workinprogress.workplanner.dao.UserDao;
import com.workinprogress.workplanner.model.User;
import com.workinprogress.workplanner.service.UserService;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
		super();
	}

	@Autowired
	private UserDao userDao;

	public UserServiceImpl(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public User loadById(Long id) {
		return userDao.loadUserOldType(id);
	}

	@Override
	public Long saveUser(User user) {
		return userDao.saveUser(user);
	}

	@Override
	public User loadUser(Long id) {
		return userDao.loadUser(id);
	}

}
