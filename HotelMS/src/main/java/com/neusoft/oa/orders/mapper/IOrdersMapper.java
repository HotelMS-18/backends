package com.neusoft.oa.orders.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.oa.orders.model.OrdersModel;

@Mapper
public interface IOrdersMapper {

	public void addOrder(OrdersModel order);//增加订单
	
	public List<OrdersModel> findByUid(int uid);//根据客人id查询订单
	
	public OrdersModel findByOid(int oid);//根据订单id查询订单
	
	public List<OrdersModel> findAll();//查询全部订单
	
	public List<OrdersModel> findReservedByPage(String orderStatus);//查询已预订的订单
	
	public void updateToReservedById(@Param("orderStatus")String orderStatus, @Param("oid")int oid);//修改订单为已预订
	
	public void updateToCompleteById(@Param("orderStatus")String orderStatus, @Param("oid") int oid);//修改定单位已完成（已入住）
	
	public void updateToCancelById(@Param("orderStatus")String orderStatus, @Param("oid")int oid);//取消预订
}
