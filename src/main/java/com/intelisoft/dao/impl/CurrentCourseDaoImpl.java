package com.intelisoft.dao.impl;

import com.intelisoft.dao.ICurrentCourseDao;
import com.intelisoft.models.CurrentCourse;

public class CurrentCourseDaoImpl extends GenericDaoImpl<CurrentCourse> implements ICurrentCourseDao {

	public CurrentCourseDaoImpl(Class<CurrentCourse> clazz) {
		super(CurrentCourse.class);
	}

}
