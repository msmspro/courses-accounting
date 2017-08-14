package com.intelisoft.courses.accounting.services;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.IUserDao;
import com.intelisoft.courses.accounting.api.services.IUserService;
import com.intelisoft.courses.accounting.dao.UserDaoImpl;
import com.intelisoft.courses.accounting.models.User;

public class UserServiceImpl extends GenericServiceImpl<User> implements IUserService {

	private static final Logger log = Logger.getLogger(UserServiceImpl.class);

	private static IUserDao dao = new UserDaoImpl();

	public UserServiceImpl() {
		super(dao);
	}

}
