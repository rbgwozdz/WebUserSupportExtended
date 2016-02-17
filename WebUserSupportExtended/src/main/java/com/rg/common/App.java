package com.rg.common;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rg.manager.WebUserManager;

public class App {

	public static void main(String[] args) {
    	ApplicationContext appContext = 
    	    	  new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
       	WebUserManager webUserManager = (WebUserManager)appContext.getBean("webUserManager");
    	com.rg.domain.WebUser webUser = new com.rg.domain.WebUser();
    	webUser.setUid("xx");
    	webUser.setFirstName("Rich");
    	Date date = new Date(); // Or where ever you get it from
    	Calendar cal = Calendar.getInstance();
    	cal.setTime(date);
    	cal.add(Calendar.DATE, -30);
    	Date dateBefore30Days = cal.getTime();    	
    	webUser.setCreateDate(dateBefore30Days);
    	webUserManager.save(webUser);
    	System.out.println("Done");
    	webUserManager.findExpiredNewUsers();
      	System.out.println("Done1");
	}

}
