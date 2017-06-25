package com.itheima.attr;

import org.apache.catalina.Service;

import sun.print.resources.serviceui;

public class UserService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void add(){
		System.out.println("service....");
		userDao.add();
	}

}
