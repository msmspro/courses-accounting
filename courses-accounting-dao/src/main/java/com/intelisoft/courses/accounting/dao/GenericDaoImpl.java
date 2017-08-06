package com.intelisoft.courses.accounting.dao;

import java.util.List;

import org.hibernate.Session;

import com.intelisoft.courses.accounting.api.dao.IGenericDao;
import com.intelisoft.courses.accounting.models.Model;

@SuppressWarnings("unchecked")
abstract class GenericDaoImpl<T extends Model> implements IGenericDao<T> {

	private Class<T> ModelClazz;

	public GenericDaoImpl(Class<T> clazz) {
		this.ModelClazz = clazz;
	}

	@Override
	public void create(T model, Session session) {
		session.persist(model);
	}

	@Override
	public T getById(long id, Session session) {
		return (T) session.get(ModelClazz, id);
	}

	@Override
	public List<T> getAll(Session session) {
		return session.createCriteria(ModelClazz).list();
	}

	@Override
	public void update(T model, Session session) {
		session.refresh(model);
	}

	@Override
	public void delete(T model, Session session) {
		session.delete(model);
	}

}