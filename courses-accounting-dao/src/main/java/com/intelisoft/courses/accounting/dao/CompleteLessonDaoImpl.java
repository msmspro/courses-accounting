package com.intelisoft.courses.accounting.dao;

import com.intelisoft.courses.accounting.api.dao.ICompleteLessonDao;
import com.intelisoft.courses.accounting.models.CompleteLesson;

public class CompleteLessonDaoImpl extends GenericDaoImpl<CompleteLesson> implements ICompleteLessonDao {

	public CompleteLessonDaoImpl() {
		super(CompleteLesson.class);
	}

}