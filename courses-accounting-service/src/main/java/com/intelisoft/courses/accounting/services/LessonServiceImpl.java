package com.intelisoft.courses.accounting.services;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.ILessonDao;
import com.intelisoft.courses.accounting.api.services.ILessonService;
import com.intelisoft.courses.accounting.dao.LessonDaoImpl;
import com.intelisoft.courses.accounting.models.Lesson;

public class LessonServiceImpl extends GenericServiceImpl<Lesson> implements ILessonService {

	private static final Logger log = Logger.getLogger(LessonServiceImpl.class);

	private static ILessonDao dao = new LessonDaoImpl();

	public LessonServiceImpl() {
		super(dao);
	}

}
