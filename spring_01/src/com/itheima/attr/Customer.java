package com.itheima.attr;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.sun.xml.internal.fastinfoset.sax.Properties;

public class Customer {
	//定义属性
	private String[] arrs;
	private List<String> list;
	private Map<String, String> map;
	private Properties properties;
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	public void find(){
		System.out.println("arrs:"+Arrays.toString(arrs));
		System.out.println("list"+list);
		System.out.println("map"+map);
		System.out.println("properties"+properties);
	}

}
