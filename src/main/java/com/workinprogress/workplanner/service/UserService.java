package com.workinprogress.workplanner.service;

import com.workinprogress.workplanner.model.User;

public interface UserService {
	User loadById(Long id);
}
