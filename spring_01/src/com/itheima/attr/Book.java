package com.itheima.attr;

public class Book {
	private String bname;
	private String author;
	//生成有参构造注入属性
	public Book(String bname, String author) {
		super();
		this.bname = bname;
		this.author = author;
	}
	public void add(){
		System.out.println("book:"+bname+"::"+author);
	}

}
