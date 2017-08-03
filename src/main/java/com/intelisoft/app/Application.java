package com.intelisoft.app;

import org.hibernate.SessionFactory;

import com.intelisoft.utils.HibernateUtil;

public class Application {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		sessionFactory.close();
	}

}
