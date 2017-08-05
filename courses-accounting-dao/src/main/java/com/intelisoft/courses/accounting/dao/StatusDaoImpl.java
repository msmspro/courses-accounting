package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.Status;
import com.intelisoft.courses.accounting.api.dao.IStatusDao;

public class StatusDaoImpl extends GenericDaoImpl<Status> implements IStatusDao {

	public StatusDaoImpl(Class<Status> clazz) {
		super(Status.class);
	}

}
