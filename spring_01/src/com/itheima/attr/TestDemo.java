package com.itheima.attr;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	@Test
	public void book(){
		//加载spring配置文件 把配置文件创建
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		//通过id值获得对象
		Book book=(Book) context.getBean("book");
		System.out.println(book);
		book.add();
	}
	@Test
	public void orders(){
		//加载spring配置文件 把配置文件创建
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		//通过id值获得对象
		Orders orders=(Orders) context.getBean("orsers");
		System.out.println(orders);
		orders.add();
	}
	@Test
	public void userService(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		UserService userService=(UserService) context.getBean("userService");
		userService.add();
	}
	@Test
	public void person(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		Person person=(Person) context.getBean("person");
		person.add();
	}
	@Test
	public void userDao(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		UserDao userDao=(UserDao) context.getBean("userDao");
		userDao.add();
	}
	@Test
	public void Customer(){
		ApplicationContext context=new ClassPathXmlApplicationContext("bean2.xml");
		Customer customer=(Customer) context.getBean("customer");
		customer.find();
	}

}
