package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.Lesson;
import com.intelisoft.courses.accounting.api.dao.ILessonDao;

public class LessonDaoImpl extends GenericDaoImpl<Lesson> implements ILessonDao {

	public LessonDaoImpl(Class<Lesson> clazz) {
		super(Lesson.class);
	}

}
