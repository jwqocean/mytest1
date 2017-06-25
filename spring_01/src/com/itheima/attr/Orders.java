package com.itheima.attr;

public class Orders {
	private String oname;
	private String oaddress;
	public void setOname(String oname) {
		this.oname = oname;
	}
	public void setOaddress(String oaddress) {
		this.oaddress = oaddress;
	}
	public void add(){
		System.out.println("orders:"+oname+"::"+oaddress);
	}

}
