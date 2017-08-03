package com.intelisoft.services.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.intelisoft.dao.IGenericDao;
import com.intelisoft.models.Model;
import com.intelisoft.services.IGenericService;
import com.intelisoft.utils.HibernateUtil;

abstract class GenericServiceImpl<T extends Model> implements IGenericService<T> {

	private static final Logger log = Logger.getLogger(GenericServiceImpl.class);

	protected SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

	private IGenericDao dao;

	/*
	 * protected GenericServiceImpl(IGenericDao<T> dao) { this.dao = dao; }
	 */
	@Override
	public void create(T model) {

		Session session = null;

		try {

			session = sessionFactory.openSession();
			session.beginTransaction();

			dao.create(model, session);

			session.getTransaction().commit();

		} catch (Exception e) {

			log.error("Exceplion in create service method.", e);
			;
			session.getTransaction().rollback();

		} finally {
			if (session != null)
				session.close();
		}
	}

	@Override
	public T getById(long id) {

		return null;
	}

	@Override
	public List<T> getAll() {

		return null;
	}

	@Override
	public void update(T model) {

	}

	@Override
	public void delete(T model) {

	}
}