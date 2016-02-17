package com.rg.manager;

import java.util.List;

import com.rg.domain.WebUser;

public interface WebUserManager {
	void save(WebUser webUser);
	void update(WebUser webUser);
	void delete(WebUser webUser);
	List<WebUser> findExpiredNewUsers();
}
