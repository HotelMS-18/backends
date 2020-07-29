package com.neusoft.oa.orders.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.neusoft.oa.house.model.HouseModel;
import com.neusoft.oa.user.model.UserModel;

@Alias("Order")
public class OrdersModel {

	private int oid;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date orderTime=null;//订单时间
	//private String orderTimeStr=null;
	private double orderPrice=0;//订单价格
	private String orderStatus=null;//订单状态
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date comeTime=null;//入住时间
	//private String comeTimeStr=null;
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Date departureTime=null;//退房时间
	//private String departureTimeStr=null;
	private int houseId=0;//房间号
	private int userId=0;//房客
	
	private HouseModel houseModel;
	private UserModel userModel;
	
	
	
	
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	/*public String getOrderTimeStr() {
		return orderTimeStr;
	}
	public void setOrderTimeStr(String orderTimeStr) {
		this.orderTimeStr = orderTimeStr;
	}*/
	public double getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(double orderPrice) {
		this.orderPrice = orderPrice;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getComeTime() {
		return comeTime;
	}
	public void setComeTime(Date comeTime) {
		this.comeTime = comeTime;
	}
	/*public String getComeTimeStr() {
		return comeTimeStr;
	}
	public void setComeTimeStr(String comeTimeStr) {
		this.comeTimeStr = comeTimeStr;
	}*/
	public Date getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}
	/*public String getDepartureTimeStr() {
		return departureTimeStr;
	}
	public void setDepartureTimeStr(String departureTimeStr) {
		this.departureTimeStr = departureTimeStr;
	}*/
	public int getHouseId() {
		return houseId;
	}
	public void setHouseId(int houseId) {
		this.houseId = houseId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public HouseModel getHouseModel() {
		return houseModel;
	}
	public void setHouseModel(HouseModel houseModel) {
		this.houseModel = houseModel;
	}
	public UserModel getUserModel() {
		return userModel;
	}
	public void setUserModel(UserModel userModel) {
		this.userModel = userModel;
	}
	
	
	
	
}
