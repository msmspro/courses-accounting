package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.CompleteLesson;
import com.intelisoft.courses.accounting.api.dao.ICompleteLessonDao;

public class CompleteLessonDaoImpl extends GenericDaoImpl<CompleteLesson> implements ICompleteLessonDao {

	public CompleteLessonDaoImpl(Class<CompleteLesson> clazz) {
		super(CompleteLesson.class);
	}

}
