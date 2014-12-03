package com.io.gastrIO.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.io.gastrIO.model.UserDetails;
@Repository
@Transactional
public class UserDetailsRepository extends GenericDaoJpaImpl<UserDetails, Integer> implements UserDetailsDao {

}
