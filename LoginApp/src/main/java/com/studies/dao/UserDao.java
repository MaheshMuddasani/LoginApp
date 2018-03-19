package com.studies.dao;

import com.studies.model.Login;
import com.studies.model.User;
public interface UserDao {
  void register(User user);
  User validateUser(Login login);
}
