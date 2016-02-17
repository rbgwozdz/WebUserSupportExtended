package com.rg.dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rg.dao.BaseDao;
import com.rg.domain.WebUser;

public class BaseDaoImpl extends HibernateDaoSupport implements BaseDao{

	public void save(Object obj) {
		getHibernateTemplate().update(obj);		
	}

	public void create(Object obj) {
		getHibernateTemplate().save(obj);
	}
 
	public void delete(Object obj){
		getHibernateTemplate().delete(obj);
	}
	
}
