package com.rg.dao.impl;

import java.util.List;








import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.rg.dao.BaseDao;
import com.rg.dao.WebUserDao;
import com.rg.domain.WebUser;

public class WebUserDaoImpl extends BaseDaoImpl implements WebUserDao{

	
 	
	public List<WebUser> findExpiredNewUsers() {
		final String query = "SELECT ID FROM WEB_USERS WHERE LAST_LOGIN_DATE is null and CREATE_DATE < DATE_SUB(CURDATE(), INTERVAL 30 DAY) ";
	
		 List<WebUser> ResultList = (List<WebUser>) getHibernateTemplate().execute(
				    new HibernateCallback() {
				    public Object doInHibernate(Session session) throws HibernateException {
				    SQLQuery sq =session.createSQLQuery(query);
				    return sq.list();
				    }});
		 System.out.println(ResultList.size());
		return ResultList;
	}
	
}
