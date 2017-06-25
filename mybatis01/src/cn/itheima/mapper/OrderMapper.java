package cn.itheima.mapper;

import java.util.List;

import cn.itheima.pojo.Orders;



public interface OrderMapper {
	//需求：查询所有订单，关联查询下单用户信息，一对一关联
	public List<Orders> findOrderAndUser();
	
}
