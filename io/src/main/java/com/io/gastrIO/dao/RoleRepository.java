package com.io.gastrIO.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.io.gastrIO.model.Role;
@Repository
@Transactional
public class RoleRepository extends GenericDaoJpaImpl<Role, Integer> implements RoleDao{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<Role> findAll() {
		return entityManager.createQuery("SELECT r FROM Role r",Role.class).getResultList();
	}
}
