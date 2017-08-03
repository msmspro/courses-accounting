package com.intelisoft.dao.impl;

import com.intelisoft.dao.ICostCoefficientDao;
import com.intelisoft.models.CostCoefficient;

public class CostCoefficientDaoImpl extends GenericDaoImpl<CostCoefficient> implements ICostCoefficientDao {

	public CostCoefficientDaoImpl(Class<CostCoefficient> clazz) {
		super(CostCoefficient.class);
	}

}
