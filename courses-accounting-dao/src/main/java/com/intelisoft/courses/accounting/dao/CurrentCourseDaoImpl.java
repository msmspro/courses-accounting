package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.CurrentCourse;
import com.intelisoft.courses.accounting.api.dao.ICurrentCourseDao;

public class CurrentCourseDaoImpl extends GenericDaoImpl<CurrentCourse> implements ICurrentCourseDao {

	public CurrentCourseDaoImpl(Class<CurrentCourse> clazz) {
		super(CurrentCourse.class);
	}

}
