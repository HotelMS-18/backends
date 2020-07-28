package com.neusoft.oa.house.service;

import java.util.List;

import com.neusoft.oa.house.model.HouseModel;

public interface IHouseService {

	List<HouseModel> findAllVacant();//查询空房
	
	List<HouseModel> findByName(String houseName);//根据房名查找空房
	
	HouseModel findById(int hid);//根据id查找房间
	
	List<HouseModel> findAllHouse();//查询全部房间
	
	int findVacantCount();//查询空房数量
	
	int findPresentCount();//查询预订房数量
	
	int findNotVacantCount();//查询住人房数量
	
	List<HouseModel> findByHouseName(String houseName);//根据房间名查询房间
	
	List<HouseModel> findByHouseState(String houseState);//根据房间状态查询
	
	//多条件查询
	List<HouseModel> findByMutiCondition(String houseName, String houseState);
	
	void updateToPeople(int hid);//修改房间状态为住人
	
	List<HouseModel> findNotVacant();//查询非空房间
	
	void updateToVacant(int hid);//修改房间状态为空
	
	void updateToPresent(int hid);//修改房间状态为预订
	
	 List<HouseModel> findAllByPage(int page, int rows);//分页模式
	 
	 void addHouse(HouseModel house);
	 
	 void updateHouse(HouseModel house);
	 
	 void deleteHouse(HouseModel house);

	
	
}
