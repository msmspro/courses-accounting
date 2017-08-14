package com.intelisoft.courses.accounting.api.dao;

import java.util.List;

import org.hibernate.Session;

import com.intelisoft.courses.accounting.models.Course;

public interface ICourseDao extends IGenericDao<Course> {

	public List<Course> getAllCoursesWithLessons(Session session) throws Exception;

}
