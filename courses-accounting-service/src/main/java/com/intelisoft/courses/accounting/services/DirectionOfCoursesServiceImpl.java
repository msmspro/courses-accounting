package com.intelisoft.courses.accounting.services;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.IDirectionOfCoursesDao;
import com.intelisoft.courses.accounting.api.services.IDirectionOfCoursesService;
import com.intelisoft.courses.accounting.dao.DirectionOfCoursesDaoImpl;
import com.intelisoft.courses.accounting.models.DirectionOfCourses;

public class DirectionOfCoursesServiceImpl extends GenericServiceImpl<DirectionOfCourses>
		implements IDirectionOfCoursesService {

	private static final Logger log = Logger.getLogger(DirectionOfCoursesServiceImpl.class);

	private static IDirectionOfCoursesDao dao = new DirectionOfCoursesDaoImpl();

	public DirectionOfCoursesServiceImpl() {
		super(dao);
	}

}
