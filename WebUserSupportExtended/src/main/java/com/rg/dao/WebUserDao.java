package com.rg.dao;

import java.util.List;

import com.rg.domain.WebUser;

public interface WebUserDao extends BaseDao{
	
	List<WebUser> findExpiredNewUsers();
	
}
