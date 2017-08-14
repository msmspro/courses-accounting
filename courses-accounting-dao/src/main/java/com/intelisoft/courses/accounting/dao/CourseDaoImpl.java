package com.intelisoft.courses.accounting.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import com.intelisoft.courses.accounting.api.dao.ICourseDao;
import com.intelisoft.courses.accounting.models.Course;

public class CourseDaoImpl extends GenericDaoImpl<Course> implements ICourseDao {

	private final static Logger log = Logger.getLogger(CourseDaoImpl.class);

	public CourseDaoImpl() {
		super(Course.class);
	}

	@Override
	public List<Course> getAllCoursesWithLessons(Session session) throws Exception {

		List<Course> courses = null;

		try {
			Criteria criteria = session.createCriteria(Course.class);

			courses = criteria.list();

			for (Course course : courses) {
				Hibernate.initialize(course.getLessons());
			}

		} catch (Exception e) {
			log.error("Error in dao, getAllCoursesWithLessons method", e);
		}

		return courses;
	}

}
