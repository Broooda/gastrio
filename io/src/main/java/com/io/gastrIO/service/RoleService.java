package com.io.gastrIO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.io.gastrIO.dao.RoleDao;
import com.io.gastrIO.dao.UserDao;
import com.io.gastrIO.model.Role;

@Service
@Transactional
public class RoleService implements IRoleService {

	@Autowired
	private RoleDao roleDao;
	@Autowired
	private UserDao userDao;

	@Override
	public Role create(Role r) {
		return roleDao.create(r);
	}

	@Override
	public Role read(int id) {
		return roleDao.read(id);
	}

	@Override
	public Role update(Role r) {
		return roleDao.update(r);
	}

	@Override
	public void delete(Role r) {
		roleDao.delete(r);

	}

	@Override
	public List<Role> findAll() {
		return roleDao.findAll();
	}

}
