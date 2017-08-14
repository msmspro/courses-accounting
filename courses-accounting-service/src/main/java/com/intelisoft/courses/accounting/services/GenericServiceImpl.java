package com.intelisoft.courses.accounting.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.proxy.HibernateProxy;

import com.intelisoft.courses.accounting.api.dao.IGenericDao;
import com.intelisoft.courses.accounting.api.services.IGenericService;
import com.intelisoft.courses.accounting.models.Model;
import com.intelisoft.courses.accounting.utils.HibernateUtil;

public class GenericServiceImpl<T extends Model> implements IGenericService<T> {

	private static final Logger log = Logger.getLogger(GenericServiceImpl.class);

	private IGenericDao<T> dao;

	protected GenericServiceImpl(IGenericDao<T> dao) {
		this.dao = dao;
	}

	public List<T> unproxy(List<T> models) {
		for (T model : models) {
			unproxy(model);
		}
		return models;
	}

	@SuppressWarnings("unchecked")
	public T unproxy(T model) {
		if (model instanceof HibernateProxy) {
			model = (T) ((HibernateProxy) model).getHibernateLazyInitializer().getImplementation();
		}
		return model;
	}

	@Override
	public void create(T model) {

		Session session = HibernateUtil.getSession();

		try {

			session.beginTransaction();

			dao.create(model, session);

			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			log.error("Error in GenericService, create method", e);
		} finally {
			session.close();
		}

	}

	@Override
	public T getById(long id) {

		Session session = HibernateUtil.getSession();

		T model = null;

		try {

			session.beginTransaction();

			model = dao.getById(id, session);

			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			log.error("Error in service, getById method", e);
		} finally {
			session.close();
		}

		return model;
	}

	@Override
	public List<T> getAll() {

		Session session = HibernateUtil.getSession();

		List<T> models = null;

		try {

			session.beginTransaction();

			models = dao.getAll(session);

			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			log.error("Error in service, getAll method", e);
		} finally {
			session.close();
		}

		return models;
	}

	@Override
	public void update(T model) {

		Session session = HibernateUtil.getSession();

		try {

			session.beginTransaction();

			dao.update(model, session);

			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			log.error("Error in GenericService, update method", e);
		} finally {
			session.close();
		}

	}

	@Override
	public void delete(T model) {

		Session session = HibernateUtil.getSession();

		try {

			session.beginTransaction();

			dao.delete(model, session);

			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			log.error("Error in GenericService, delete method", e);
		} finally {
			session.close();
		}

	}

}
