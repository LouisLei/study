package com.lakala.work.test_dubbox_api;

import javax.validation.constraints.Min;

public interface UserRestService {

	public User getUser(
			@Min(value = 1L, message = "User ID must be greater than 1") Long id);

}
