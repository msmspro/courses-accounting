package com.intelisoft.courses.accounting.dao;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.ICurrentCourseDao;
import com.intelisoft.courses.accounting.models.CurrentCourse;

public class CurrentCourseDaoImpl extends GenericDaoImpl<CurrentCourse> implements ICurrentCourseDao {

	private final static Logger log = Logger.getLogger(CurrentCourseDaoImpl.class);

	public CurrentCourseDaoImpl() {
		super(CurrentCourse.class);
	}

}
