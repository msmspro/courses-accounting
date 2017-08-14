package com.intelisoft.courses.accounting.services;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.ICompleteLessonDao;
import com.intelisoft.courses.accounting.api.services.ICompleteLessonService;
import com.intelisoft.courses.accounting.dao.CompleteLessonDaoImpl;
import com.intelisoft.courses.accounting.models.CompleteLesson;

public class CompleteLessonServiceImpl extends GenericServiceImpl<CompleteLesson> implements ICompleteLessonService {

	private static final Logger log = Logger.getLogger(CompleteLessonServiceImpl.class);

	private static ICompleteLessonDao dao = new CompleteLessonDaoImpl();

	public CompleteLessonServiceImpl() {
		super(dao);
	}

}
