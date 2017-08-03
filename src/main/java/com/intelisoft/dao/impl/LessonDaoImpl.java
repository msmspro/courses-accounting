package com.intelisoft.dao.impl;

import com.intelisoft.dao.ILessonDao;
import com.intelisoft.models.Lesson;

public class LessonDaoImpl extends GenericDaoImpl<Lesson> implements ILessonDao {

	public LessonDaoImpl(Class<Lesson> clazz) {
		super(Lesson.class);
	}

}
