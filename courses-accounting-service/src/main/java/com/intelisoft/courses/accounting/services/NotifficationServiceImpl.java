package com.intelisoft.courses.accounting.services;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.intelisoft.courses.accounting.api.dao.INotifficationDao;
import com.intelisoft.courses.accounting.api.services.INotifficationService;
import com.intelisoft.courses.accounting.dao.NotifficationDaoImpl;
import com.intelisoft.courses.accounting.models.Notiffication;
import com.intelisoft.courses.accounting.utils.HibernateUtil;

public class NotifficationServiceImpl implements INotifficationService {

	private static final Logger log = Logger.getLogger(NotifficationServiceImpl.class);

	INotifficationDao dao = new NotifficationDaoImpl();

	public void createNottification(Notiffication notiffication) {

		Session session = HibernateUtil.getSession();

		session.beginTransaction();

		try {

			dao.create(notiffication, session);

			session.getTransaction().commit();

			session.close();

		} catch (Exception e) {
			session.getTransaction().rollback();
			log.error("Error in service, createNottification method", e);
		}
	}

}
