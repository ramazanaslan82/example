package com.workinprogress.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory buildSessionFactory;
	static {

		buildSessionFactory = new Configuration().configure()
				.buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return buildSessionFactory;
	}
}
