package com.intelisoft.courses.accounting.app;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.services.ICourseService;
import com.intelisoft.courses.accounting.services.CourseServiceImpl;

public class Application {

	private static final Logger log = Logger.getLogger(Application.class);

	public static void main(String[] args) {
		ICourseService service = new CourseServiceImpl();
		log.info(service.getCoursesWithLessonsAndTopics());

	}

}