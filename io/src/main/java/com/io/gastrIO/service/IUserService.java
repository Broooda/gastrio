package com.io.gastrIO.service;

import com.io.gastrIO.model.User;
import com.io.gastrIO.model.UserDetails;

public interface IUserService {
	UserDetails create(UserDetails t);

	UserDetails read(int id);

	UserDetails update(UserDetails t);

	void delete(UserDetails t);

	User createUser(User t);

	User readUser(int id);

	User updateUser(User t);

	void deleteUser(User t);

}
