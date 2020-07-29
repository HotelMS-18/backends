package com.neusoft.oa.orders.service;

import java.util.List;

import com.neusoft.oa.orders.model.OrdersModel;

public interface IOrdersService {

	public void addOrder(OrdersModel order);//增加订单
	
	public List<OrdersModel> findByUid(int uid, int page, int size);//根据客人id查询订单
	
	public List<OrdersModel> findAll(int page, int size);//查询全部订单
	
	public List<OrdersModel> findReservedByPage(int page, int size);//查询已预订的订单
	
	public void updateToReservedById(int id);//修改订单为已预订
	
	public void updateToCompleteById(int id);//修改订单为已完成（已入住）
	
	public void updateToCancelById(int id);//取消预订
}
