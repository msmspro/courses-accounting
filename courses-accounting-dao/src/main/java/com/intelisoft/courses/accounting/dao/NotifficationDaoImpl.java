package com.intelisoft.courses.accounting.dao;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.INotifficationDao;
import com.intelisoft.courses.accounting.models.Notiffication;

public class NotifficationDaoImpl extends GenericDaoImpl<Notiffication> implements INotifficationDao {

	private final static Logger log = Logger.getLogger(NotifficationDaoImpl.class);

	public NotifficationDaoImpl() {
		super(Notiffication.class);
	}

}
