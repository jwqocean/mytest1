package com.itheima.springdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
	@Test
	public void testUser(){
		//加载spring配置文件,把配置文件创建
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		//根据id获取对象值
		User user=(User) context.getBean("user");
		//User user1=context.getBean("user", User.class);
		System.out.println(user);
		user.add();
	}

}
