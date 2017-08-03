package com.intelisoft.dao.impl;

import com.intelisoft.dao.ICourseDao;
import com.intelisoft.models.Course;

public class CourseDaoImpl extends GenericDaoImpl<Course> implements ICourseDao {

	public CourseDaoImpl(Class<Course> clazz) {
		super(Course.class);
	}

}
