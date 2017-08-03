package com.intelisoft.services;

import java.util.List;

import com.intelisoft.models.Model;

public interface IGenericService<T extends Model> {

	void create(T model);

	T getById(long id);

	List<T> getAll();

	void update(T model);

	void delete(T model);

}