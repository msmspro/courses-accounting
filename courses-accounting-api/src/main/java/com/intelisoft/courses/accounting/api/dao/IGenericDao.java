package com.intelisoft.courses.accounting.api.dao;

import java.util.List;

import org.hibernate.Session;

import com.intelisoft.courses.accounting.models.Model;

public interface IGenericDao<T extends Model> {

	void create(T model, Session session) throws Exception;

	T getById(long id, Session session) throws Exception;

	List<T> getAll(Session session) throws Exception;

	void update(T model, Session session) throws Exception;

	void delete(T model, Session session) throws Exception;

}
