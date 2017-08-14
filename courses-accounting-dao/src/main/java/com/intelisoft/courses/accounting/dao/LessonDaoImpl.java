package com.intelisoft.courses.accounting.dao;

import org.apache.log4j.Logger;

import com.intelisoft.courses.accounting.api.dao.ILessonDao;
import com.intelisoft.courses.accounting.models.Lesson;

public class LessonDaoImpl extends GenericDaoImpl<Lesson> implements ILessonDao {

	private final static Logger log = Logger.getLogger(LessonDaoImpl.class);

	public LessonDaoImpl() {
		super(Lesson.class);
	}

}
