package com.intelisoft.courses.accounting.dao;

import com.intelisoft.courses.accounting.api.dao.ICourseDao;
import com.intelisoft.courses.accounting.models.Course;

public class CourseDaoImpl extends GenericDaoImpl<Course> implements ICourseDao {

	public CourseDaoImpl() {
		super(Course.class);
	}

}
