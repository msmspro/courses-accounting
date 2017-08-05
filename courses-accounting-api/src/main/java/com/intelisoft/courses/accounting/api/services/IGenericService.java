package com.intelisoft.courses.accounting.api.services;

import java.util.List;

import com.inetlisoft.courses.accounting.models.Model;

public interface IGenericService<T extends Model> {

	void create(T model);

	T getById(long id);

	List<T> getAll();

	void update(T model);

	void delete(T model);

}