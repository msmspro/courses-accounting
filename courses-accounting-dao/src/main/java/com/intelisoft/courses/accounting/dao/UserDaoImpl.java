package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.User;
import com.intelisoft.courses.accounting.api.dao.IUserDao;

public class UserDaoImpl extends GenericDaoImpl<User> implements IUserDao {

	public UserDaoImpl(Class<User> clazz) {
		super(User.class);
	}

}
