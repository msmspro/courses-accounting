package com.intelisoft.courses.accounting.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.intelisoft.courses.accounting.api.dao.IGenericDao;
import com.intelisoft.courses.accounting.models.Model;

@SuppressWarnings("unchecked")
abstract class GenericDaoImpl<T extends Model> implements IGenericDao<T> {

	private final static Logger log = Logger.getLogger(GenericDaoImpl.class);

	private Class<T> modelClazz;

	public GenericDaoImpl(Class<T> clazz) {
		this.modelClazz = clazz;
	}

	@Override
	public void create(T model, Session session) throws Exception {

		try {
			session.persist(model);
		} catch (Exception e) {
			log.error("Error in dao, create method", e);
		}
	}

	@Override
	public T getById(long id, Session session) throws Exception {

		T model = null;

		try {
			model = (T) session.get(modelClazz, id);
		} catch (Exception e) {
			log.error("Error in dao, getById method", e);
		}
		return model;
	}

	@Override
	public List<T> getAll(Session session) throws Exception {

		List<T> models = null;

		try {
			models = session.createCriteria(modelClazz).list();
		} catch (Exception e) {
			log.error("Error in dao, getAll method", e);
		}
		return models;
	}

	@Override
	public void update(T model, Session session) throws Exception {

		try {
			session.refresh(model);
		} catch (Exception e) {
			log.error("Error in dao, update method", e);
		}
	}

	@Override
	public void delete(T model, Session session) throws Exception {

		try {
			session.delete(model);
		} catch (Exception e) {
			log.error("Error in dao, delete method", e);
		}
	}
}