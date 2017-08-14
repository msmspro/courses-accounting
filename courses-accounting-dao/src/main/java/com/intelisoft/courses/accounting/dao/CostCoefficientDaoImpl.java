package com.intelisoft.courses.accounting.dao;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.ICostCoefficientDao;
import com.intelisoft.courses.accounting.models.CostCoefficient;

public class CostCoefficientDaoImpl extends GenericDaoImpl<CostCoefficient> implements ICostCoefficientDao {

	private final static Logger log = Logger.getLogger(CostCoefficientDaoImpl.class);

	public CostCoefficientDaoImpl() {
		super(CostCoefficient.class);
	}

}
