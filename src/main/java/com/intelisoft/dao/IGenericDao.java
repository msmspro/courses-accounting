package com.intelisoft.dao;

import java.util.List;

import org.hibernate.Session;

import com.intelisoft.models.Model;

public interface IGenericDao<T extends Model> {

	void create(T model, Session session);

	T getById(long id, Session session);

	List<T> getAll(Session session);

	void update(T model, Session session);

	void delete(T model, Session session);

}
