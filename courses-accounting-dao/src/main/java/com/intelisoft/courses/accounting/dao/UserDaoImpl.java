package com.intelisoft.courses.accounting.dao;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.IUserDao;
import com.intelisoft.courses.accounting.models.User;

public class UserDaoImpl extends GenericDaoImpl<User> implements IUserDao {

	private final static Logger log = Logger.getLogger(UserDaoImpl.class);

	public UserDaoImpl() {
		super(User.class);
	}

}
