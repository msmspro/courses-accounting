package com.intelisoft.dao.impl;

import com.intelisoft.dao.IUserDao;
import com.intelisoft.models.User;

public class UserDaoImpl extends GenericDaoImpl<User> implements IUserDao {

	public UserDaoImpl(Class<User> clazz) {
		super(User.class);
	}

}
