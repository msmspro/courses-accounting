package com.intelisoft.courses.accounting.services;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.ICurrentCourseDao;
import com.intelisoft.courses.accounting.api.services.ICurrentCourseService;
import com.intelisoft.courses.accounting.dao.CurrentCourseDaoImpl;
import com.intelisoft.courses.accounting.models.CurrentCourse;

public class CurrentCourseServiceImpl extends GenericServiceImpl<CurrentCourse> implements ICurrentCourseService {

	private static final Logger log = Logger.getLogger(CurrentCourseServiceImpl.class);

	private static ICurrentCourseDao dao = new CurrentCourseDaoImpl();

	public CurrentCourseServiceImpl() {
		super(dao);
	}

}
