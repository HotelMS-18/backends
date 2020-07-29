package com.neusoft.oa.orders.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.neusoft.oa.house.mapper.IHouseMapper;
import com.neusoft.oa.orders.mapper.IOrdersMapper;
import com.neusoft.oa.orders.model.OrdersModel;
import com.neusoft.oa.orders.service.IOrdersService;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService {

	@Autowired
	private IOrdersMapper ordersMapper=null;
	
	@Autowired
	private IHouseMapper houseMapper=null;
	
	@Override
	public void addOrder(OrdersModel order) {
		// TODO Auto-generated method stub
		Date d1 = order.getComeTime();
		Date d2 = order.getDepartureTime();
		long diff = d2.getTime() - d1.getTime();
		long days = diff / (1000 * 60 * 60 * 24);
		double price = order.getHouseModel().getHousePrice();
		order.setOrderPrice(days * price);
		ordersMapper.addOrder(order);
		houseMapper.updateToReservedById(order.getHouseId(), "空房");
	}

	@Override
	public List<OrdersModel> findByUid(int uid, int page, int size) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, size);
		return ordersMapper.findByUid(uid);
	}

	@Override
	public List<OrdersModel> findAll(int page, int size) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, size);
		return ordersMapper.findAll();
	}

	@Override
	public List<OrdersModel> findReservedByPage(int page, int size) {
		// TODO Auto-generated method stub
		PageHelper.startPage(page, size);
		return ordersMapper.findReservedByPage("已预订");
	}

	@Override
	public void updateToReservedById(int id) {
		// TODO Auto-generated method stub
		//修改订单状态和房间状态
		ordersMapper.updateToReservedById("已预订", id);
		OrdersModel order = ordersMapper.findByOid(id);
		houseMapper.updateToReservedById(order.getHouseId(), "空房");
	}

	@Override
	public void updateToCompleteById(int id) {
		// TODO Auto-generated method stub
		ordersMapper.updateToCompleteById("已完成", id);;
		OrdersModel order = ordersMapper.findByOid(id);
		houseMapper.updateToVacant(order.getHouseId(), "住人");
	}

	@Override
	public void updateToCancelById(int id) {
		// TODO Auto-generated method stub
		ordersMapper.updateToCancelById("已取消", id);
		OrdersModel order = ordersMapper.findByOid(id);
		houseMapper.updateToVacant(order.getHouseId(), "预订");
	}

}
