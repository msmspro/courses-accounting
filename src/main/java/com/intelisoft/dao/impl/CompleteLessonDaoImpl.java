package com.intelisoft.dao.impl;

import com.intelisoft.dao.ICompleteLessonDao;
import com.intelisoft.models.CompleteLesson;

public class CompleteLessonDaoImpl extends GenericDaoImpl<CompleteLesson> implements ICompleteLessonDao {

	public CompleteLessonDaoImpl(Class<CompleteLesson> clazz) {
		super(CompleteLesson.class);
	}

}
