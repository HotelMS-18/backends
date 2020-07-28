package com.neusoft.oa.house.model;

import org.apache.ibatis.type.Alias;

//酒店房间
@Alias("House")
public class HouseModel {

	private int hid;//房间id
	private String houseName = null;//房间名
	private String houseState = null;//房间状态
	private double housePrice =0;//房间价格
	private int houseNum = 0;//房间号
	private int count = 0;//空房间剩余数量
	
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHouseName() {
		return houseName;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	public String getHouseState() {
		return houseState;
	}
	public void setHouseState(String houseState) {
		this.houseState = houseState;
	}
	public double getHousePrice() {
		return housePrice;
	}
	public void setHousePrice(double housePrice) {
		this.housePrice = housePrice;
	}
	public int getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(int houseNum) {
		this.houseNum = houseNum;
	}
	
	@Override
	public String toString() {
		String result = "House:" + 
						"\nhid: " + hid + 
						"\nhouseName: " + houseName + 
						"\nhouseState: " + houseState + 
						"\nhousePrice: " + housePrice+
						"\nhouseNum: " + houseNum+ 
						"count: " + count;
		return result;
	}
	
}
