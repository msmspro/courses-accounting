package com.intelisoft.courses.accounting.dao;

import com.intelisoft.courses.accounting.api.dao.INotifficationDao;
import com.intelisoft.courses.accounting.models.Notiffication;

public class NotifficationDaoImpl extends GenericDaoImpl<Notiffication> implements INotifficationDao {

	public NotifficationDaoImpl() {
		super(Notiffication.class);
	}

}
