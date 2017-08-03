package com.intelisoft.dao.impl;

import com.intelisoft.dao.INotifficationDao;
import com.intelisoft.models.Notiffication;

public class NotifficationDaoImpl extends GenericDaoImpl<Notiffication> implements INotifficationDao {

	public NotifficationDaoImpl(Class<Notiffication> clazz) {
		super(Notiffication.class);
	}

}
