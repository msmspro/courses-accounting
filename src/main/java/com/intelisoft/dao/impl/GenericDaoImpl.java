package com.intelisoft.dao.impl;

import java.util.List;

import org.hibernate.Session;

import com.intelisoft.dao.IGenericDao;
import com.intelisoft.model.Model;

@SuppressWarnings("unchecked")
abstract class GenericDaoImpl<T extends Model> implements IGenericDao<T> {

	private Class<T> ModelClazz;

	public GenericDaoImpl(Class<T> clazz) {
		this.ModelClazz = clazz;
	}

	@Override
	public void create(T model, Session session) {
		session.save(model);
	}

	@Override
	public T getById(long id, Session session) {
		return (T) session.get(ModelClazz, id);
	}

	@Override
	public List<T> getAll(Session session) {
		return null;// (List<T>) session
	}

	@Override
	public void update(T model, Session session) {
		session.update(model);

	}

	@Override
	public void delete(T model, Session session) {
		session.delete(model);

	}

}