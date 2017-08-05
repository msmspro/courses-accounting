package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.Notiffication;
import com.intelisoft.courses.accounting.api.dao.INotifficationDao;

public class NotifficationDaoImpl extends GenericDaoImpl<Notiffication> implements INotifficationDao {

	public NotifficationDaoImpl(Class<Notiffication> clazz) {
		super(Notiffication.class);
	}

}
