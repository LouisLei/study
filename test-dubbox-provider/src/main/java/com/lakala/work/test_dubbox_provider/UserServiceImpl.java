package com.lakala.work.test_dubbox_provider;

import com.lakala.work.test_dubbox_api.User;
import com.lakala.work.test_dubbox_api.UserService;

public class UserServiceImpl implements UserService {
	public User getUser(Long id) {
		return new User(id, "username" + id);
	}
}
