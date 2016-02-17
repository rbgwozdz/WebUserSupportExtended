package com.rg.common;

import org.hibernate.SessionFactory;

public class HibernateUtil {
	private static SessionFactory sessionFactory  = null;

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public static void setSessionFactory(SessionFactory sessionFactory) {
        HibernateUtil.sessionFactory = sessionFactory;
    }
}
