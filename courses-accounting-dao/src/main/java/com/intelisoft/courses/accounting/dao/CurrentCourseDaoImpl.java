package com.intelisoft.courses.accounting.dao;

import com.intelisoft.courses.accounting.api.dao.ICurrentCourseDao;
import com.intelisoft.courses.accounting.models.CurrentCourse;

public class CurrentCourseDaoImpl extends GenericDaoImpl<CurrentCourse> implements ICurrentCourseDao {

	public CurrentCourseDaoImpl() {
		super(CurrentCourse.class);
	}

}
