package com.io.gastrIO.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;






import com.io.gastrIO.dao.UserDao;
import com.io.gastrIO.dao.UserDetailsDao;
import com.io.gastrIO.model.User;
import com.io.gastrIO.model.UserDetails;


@Service
@Transactional
public class UserService implements IUserService {

	@Autowired
	private UserDetailsDao userDetailsDao;

	@Autowired
    private UserDao userDao;

	@Override
	public UserDetails create(UserDetails t) {
		return userDetailsDao.create(t);
	}

	@Override
	public UserDetails read(int id) {
		return userDetailsDao.read(id);
	}

	@Override
	public UserDetails update(UserDetails t) {
		return userDetailsDao.update(t);
	}

	@Override
	public void delete(UserDetails t) {
		userDetailsDao.delete(t);
	}

	@Override
    public User createUser(User t) {
        return userDao.create(t);
    }

    @Override
    public User readUser(int id) {
        return userDao.read(id);
    }

    @Override
    public User updateUser(User t) {
        return userDao.update(t);
    }

    @Override
    public void deleteUser(User t) {
        userDao.delete(t);

    }
}
