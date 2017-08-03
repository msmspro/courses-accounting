package com.intelisoft.dao.impl;

import com.intelisoft.dao.IStatusDao;
import com.intelisoft.models.Status;

public class StatusDaoImpl extends GenericDaoImpl<Status> implements IStatusDao {

	public StatusDaoImpl(Class<Status> clazz) {
		super(Status.class);
	}

}
