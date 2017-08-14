package com.intelisoft.courses.accounting.api.services;

import java.util.List;

import com.intelisoft.courses.accounting.models.Model;

public interface IGenericService<T extends Model> {

	T unproxy(T model);

	List<T> unproxy(List<T> models);

	void create(T model);

	T getById(long id);

	List<T> getAll();

	void update(T model);

	void delete(T model);

}