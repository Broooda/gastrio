package com.io.gastrIO.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.io.gastrIO.model.User;

@Repository
@Transactional
public class UserRepository extends GenericDaoJpaImpl<User, Integer>
		implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public User findByName(String name) {
		return entityManager.createQuery("SELECT a FROM User a WHERE a.email = :name ",User.class).setParameter("name", name).getSingleResult();
	}

	public List<User> findAll() {
		Query query = entityManager.createQuery("SELECT a FROM User a",User.class);
		return query.getResultList();
	}
}
