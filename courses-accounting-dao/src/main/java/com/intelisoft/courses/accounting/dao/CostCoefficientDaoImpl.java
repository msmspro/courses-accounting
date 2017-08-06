package com.intelisoft.courses.accounting.dao;

import com.intelisoft.courses.accounting.api.dao.ICostCoefficientDao;
import com.intelisoft.courses.accounting.models.CostCoefficient;

public class CostCoefficientDaoImpl extends GenericDaoImpl<CostCoefficient> implements ICostCoefficientDao {

	public CostCoefficientDaoImpl() {
		super(CostCoefficient.class);
	}

}
