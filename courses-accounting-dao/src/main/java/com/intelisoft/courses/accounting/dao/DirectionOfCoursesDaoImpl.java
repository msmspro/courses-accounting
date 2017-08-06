package com.intelisoft.courses.accounting.dao;

import com.intelisoft.courses.accounting.api.dao.IDirectionOfCoursesDao;
import com.intelisoft.courses.accounting.models.DirectionOfCourses;

public class DirectionOfCoursesDaoImpl extends GenericDaoImpl<DirectionOfCourses> implements IDirectionOfCoursesDao {

	public DirectionOfCoursesDaoImpl() {
		super(DirectionOfCourses.class);
	}
}
