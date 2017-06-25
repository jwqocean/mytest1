package com.itheima.attr;

public class UserDao {
	/*public void init(){
		System.out.println("init...........");
	}
	public void destory(){
		System.out.println("destory............");
	}*/
	private String username;
	
	public void setUsername(String username) {
		this.username = username;
	}

	public void add(){
		System.out.println("username:"+username);
	}

}
