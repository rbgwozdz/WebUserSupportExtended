package com.rg.manager.impl;

import java.util.List;

import com.rg.manager.WebUserManager;
import com.rg.dao.WebUserDao;
import com.rg.domain.WebUser;

public class WebUserManagerImpl implements WebUserManager{
	  
	WebUserDao webUserDao;
 
	public void setWebUserDao(WebUserDao webUserDao) {
		this.webUserDao = webUserDao;
	}
 
	public void save(WebUser webUser){
		webUserDao.create(webUser);
	}
 
	public void update(WebUser webUser){
		webUserDao.save(webUser);
	}
 
	public void delete(WebUser webUser){
		webUserDao.delete(webUser);
	}
	
	public List<WebUser> findExpiredNewUsers() {
		return webUserDao.findExpiredNewUsers();
	}
}