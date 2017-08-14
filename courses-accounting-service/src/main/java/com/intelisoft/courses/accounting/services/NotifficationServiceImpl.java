package com.intelisoft.courses.accounting.services;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.INotifficationDao;
import com.intelisoft.courses.accounting.api.services.INotifficationService;
import com.intelisoft.courses.accounting.dao.NotifficationDaoImpl;
import com.intelisoft.courses.accounting.models.Notiffication;

public class NotifficationServiceImpl extends GenericServiceImpl<Notiffication> implements INotifficationService {

	private static final Logger log = Logger.getLogger(NotifficationServiceImpl.class);

	private static INotifficationDao dao = new NotifficationDaoImpl();

	public NotifficationServiceImpl() {
		super(dao);
	}

}
