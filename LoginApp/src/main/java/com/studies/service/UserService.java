package com.studies.service;

import com.studies.model.Login;
import com.studies.model.User;

public interface UserService {

	User validateUser(Login login);

	void register(User user);

}
