package com.neusoft.oa.orders.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.oa.orders.model.OrdersModel;
import com.neusoft.oa.orders.service.IOrdersService;

@RestController
@RequestMapping("/order")
public class OrdersController {

	@Autowired
	private IOrdersService ordersService=null;
	
	@PostMapping("/addOrder")
	public void addOrder(OrdersModel order) {
		order.setOrderTime(new Date());
		ordersService.addOrder(order);
	}
	
	@RequestMapping("/findByUid")
	public List<OrdersModel> findByUid(int uid, @RequestParam(name = "page",required = true,defaultValue = "1" ) int page,@RequestParam(name = "size",required = true,defaultValue = "5" ) int size){
		return ordersService.findByUid(uid, page, size);
	}
	
	@RequestMapping("/findAllByPage")
	public List<OrdersModel> findAllByPage(@RequestParam(name = "page",required = true,defaultValue = "1" ) int page,@RequestParam(name = "size",required = true,defaultValue = "5" ) int size){
		return ordersService.findAll(page, size);
	}
	
	@RequestMapping("/findReservedByPage")
	public List<OrdersModel> findReservedByPage(@RequestParam(name = "page",required = true,defaultValue = "1" ) int page,@RequestParam(name = "size",required = true,defaultValue = "5" ) int size){
		return ordersService.findReservedByPage(page, size);
	}
	
	@PostMapping("/updateToReservedById")
	public void updateToReservedById(int id) {
		ordersService.updateToReservedById(id);
	}
	
	@PostMapping("/updateToCompleteById")
	public void updateToCompleteById(int id) {
		ordersService.updateToCompleteById(id);
	}
	
	@PostMapping("/updateToCancelById")
	public void updateToCancelById(int id) {
		ordersService.updateToCancelById(id);
	}
	
	
	
	
	
}
