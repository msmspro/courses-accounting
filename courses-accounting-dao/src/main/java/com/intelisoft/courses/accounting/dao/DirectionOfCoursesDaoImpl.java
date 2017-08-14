package com.intelisoft.courses.accounting.dao;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.IDirectionOfCoursesDao;
import com.intelisoft.courses.accounting.models.DirectionOfCourses;

public class DirectionOfCoursesDaoImpl extends GenericDaoImpl<DirectionOfCourses> implements IDirectionOfCoursesDao {

	private final static Logger log = Logger.getLogger(DirectionOfCoursesDaoImpl.class);

	public DirectionOfCoursesDaoImpl() {
		super(DirectionOfCourses.class);
	}
}
