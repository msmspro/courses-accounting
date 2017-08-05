package com.intelisoft.courses.accounting.dao;

import com.inetlisoft.courses.accounting.models.Topic;
import com.intelisoft.courses.accounting.api.dao.ITopicDao;

public class TopicDaoImpl extends GenericDaoImpl<Topic> implements ITopicDao {

	public TopicDaoImpl(Class<Topic> clazz) {
		super(Topic.class);
	}

}
