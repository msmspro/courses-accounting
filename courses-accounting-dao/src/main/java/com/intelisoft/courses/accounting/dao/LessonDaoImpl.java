package com.intelisoft.courses.accounting.dao;

import com.intelisoft.courses.accounting.api.dao.ILessonDao;
import com.intelisoft.courses.accounting.models.Lesson;

public class LessonDaoImpl extends GenericDaoImpl<Lesson> implements ILessonDao {

	public LessonDaoImpl() {
		super(Lesson.class);
	}

}
