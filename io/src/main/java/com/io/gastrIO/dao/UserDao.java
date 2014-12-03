package com.io.gastrIO.dao;

import java.util.List;

import com.io.gastrIO.model.User;


public interface UserDao extends GenericDao<User,Integer>  {

	User findByName(String name);

	List<User> findAll();
}
