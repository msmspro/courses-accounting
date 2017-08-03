package com.intelisoft.dao.impl;

import com.intelisoft.dao.ITopicDao;
import com.intelisoft.models.Topic;

public class TopicDaoImpl extends GenericDaoImpl<Topic> implements ITopicDao {

	public TopicDaoImpl(Class<Topic> clazz) {
		super(Topic.class);
	}

}
