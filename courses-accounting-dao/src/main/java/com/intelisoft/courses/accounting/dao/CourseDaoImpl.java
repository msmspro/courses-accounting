package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.Course;
import com.intelisoft.courses.accounting.api.dao.ICourseDao;

public class CourseDaoImpl extends GenericDaoImpl<Course> implements ICourseDao {

	public CourseDaoImpl(Class<Course> clazz) {
		super(Course.class);
	}

}
