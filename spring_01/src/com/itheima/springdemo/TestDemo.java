package com.itheima.springdemo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.itheima.attr.UserDao;

public class TestDemo {
	@Test
	public void testBean2(){
		//加载配置spring 配置文件,把配置对象创建
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		//通过id值获得对象
		bean2 bean2=(bean2) context.getBean("bean2");
		System.out.println(bean2);
	}
	@Test
	public void testDemo3(){
		//加载配置spring 配置文件,把配置对象创建
		ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		//通过id值获得对象
		Bean3 bean3=(Bean3) context.getBean("bean3");
		System.out.println(bean3);
	}
	@Test
	public void testUserDao(){
		//加载配置spring配置文件
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
		//得到配置创建对象
		UserDao userDao=(UserDao) context.getBean("userDao");
		userDao.add();
		context.close();
	}

}
