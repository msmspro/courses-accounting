package com.intelisoft.courses.accounting.dao;

import com.intelisoft.courses.accounting.api.dao.IUserDao;
import com.intelisoft.courses.accounting.models.User;

public class UserDaoImpl extends GenericDaoImpl<User> implements IUserDao {

	public UserDaoImpl() {
		super(User.class);
	}

}
