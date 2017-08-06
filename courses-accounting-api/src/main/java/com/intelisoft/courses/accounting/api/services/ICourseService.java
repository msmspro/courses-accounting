package com.intelisoft.courses.accounting.api.services;

import java.util.List;

import com.intelisoft.courses.accounting.models.Course;

public interface ICourseService {

	List<Course> getCoursesWithLessonsAndTopics();

}
