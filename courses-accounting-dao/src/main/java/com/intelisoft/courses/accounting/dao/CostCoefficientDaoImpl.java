package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.CostCoefficient;
import com.intelisoft.courses.accounting.api.dao.ICostCoefficientDao;

public class CostCoefficientDaoImpl extends GenericDaoImpl<CostCoefficient> implements ICostCoefficientDao {

	public CostCoefficientDaoImpl(Class<CostCoefficient> clazz) {
		super(CostCoefficient.class);
	}

}
