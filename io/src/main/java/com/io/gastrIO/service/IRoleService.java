package com.io.gastrIO.service;

import java.util.List;

import com.io.gastrIO.model.Role;

public interface IRoleService {
	Role create(Role t);

	Role read(int id);

	Role update(Role t);

	void delete(Role t);

	List<Role> findAll();
}
