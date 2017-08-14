package com.intelisoft.courses.accounting.dao;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.ICompleteLessonDao;
import com.intelisoft.courses.accounting.models.CompleteLesson;

public class CompleteLessonDaoImpl extends GenericDaoImpl<CompleteLesson> implements ICompleteLessonDao {

	private final static Logger log = Logger.getLogger(CompleteLessonDaoImpl.class);

	public CompleteLessonDaoImpl() {
		super(CompleteLesson.class);
	}

}