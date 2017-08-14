package com.intelisoft.courses.accounting.services;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.ICostCoefficientDao;
import com.intelisoft.courses.accounting.api.services.ICostCoefficientService;
import com.intelisoft.courses.accounting.dao.CostCoefficientDaoImpl;
import com.intelisoft.courses.accounting.models.CostCoefficient;

public class CostCoefficientServiceImpl extends GenericServiceImpl<CostCoefficient> implements ICostCoefficientService {

	private static final Logger log = Logger.getLogger(CostCoefficientServiceImpl.class);

	private static ICostCoefficientDao dao = new CostCoefficientDaoImpl();

	public CostCoefficientServiceImpl() {
		super(dao);
	}

}
