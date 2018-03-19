package com.studies.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.studies.dao.UserDao;
import com.studies.model.Login;
import com.studies.model.User;

public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao dao;
	public User validateUser(Login login) {
		// TODO Auto-generated method stub
		return dao.validateUser(login);
	}

	public void register(User user) {
		// TODO Auto-generated method stub
		dao.register(user);
	}

}
