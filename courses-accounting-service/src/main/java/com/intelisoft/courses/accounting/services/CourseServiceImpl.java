package com.intelisoft.courses.accounting.services;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Session;

import com.intelisoft.courses.accounting.api.dao.ICourseDao;
import com.intelisoft.courses.accounting.api.services.ICourseService;
import com.intelisoft.courses.accounting.dao.CourseDaoImpl;
import com.intelisoft.courses.accounting.models.Course;
import com.intelisoft.courses.accounting.utils.HibernateUtil;

public class CourseServiceImpl extends GenericServiceImpl<Course> implements ICourseService {

	private static final Logger log = Logger.getLogger(CourseServiceImpl.class);

	private static ICourseDao dao = new CourseDaoImpl();

	public CourseServiceImpl() {
		super(dao);
	}

	public List<Course> getAllCoursesWithLessons() {

		Session session = HibernateUtil.getSession();

		List<Course> courses = null;

		try {

			session.beginTransaction();

			courses = dao.getAllCoursesWithLessons(session);

			session.getTransaction().commit();

		} catch (Exception e) {
			session.getTransaction().rollback();
			log.error("Error in service, test method", e);
		} finally {
			session.close();
		}

		return courses;
	}

}
