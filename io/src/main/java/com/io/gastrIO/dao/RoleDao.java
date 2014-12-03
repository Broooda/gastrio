package com.io.gastrIO.dao;

import java.util.List;

import com.io.gastrIO.model.Role;

public interface RoleDao extends GenericDao<Role,Integer>  {

	List<Role> findAll();
}
