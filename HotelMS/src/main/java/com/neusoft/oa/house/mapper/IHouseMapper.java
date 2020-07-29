package com.neusoft.oa.house.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.oa.house.model.HouseModel;

@Mapper
public interface IHouseMapper {

	List<HouseModel> findAllVacant(String houseState);//查询空房
	
	List<HouseModel> findByName(@Param("houseName")String houseName, @Param("houseState")String houseState);//根据房名查找房间
	
	HouseModel findById(int houseId);//根据id查找房间
	
	void updateToReservedById(@Param("hid")int hid, @Param("houseState")String houseState);//根据id修改房间状态为预定
	
	void updateToNotVacant(@Param("hid")int hid, @Param("houseState")String houseState);//根据id修改房间状态为住人
	
	void updateToVacant(@Param("hid")int hid, @Param("houseState")String houseState);//根据id修改房间状态为空房
	
	List<HouseModel> findAllHouse();//查询全部房间
	
	int findAllCount();//查询全部房间数量
	
	int findVacantCount(String houseState);//查询空闲房间数量
	
	int findPreserveCount(String houseState);//查询预订房间数量
	
	int findPeopleCount(String houseState);//查询住人房间数量
	
	List<HouseModel> findByHouseName(String houseName);//根据房间名查找房间
	
	List<HouseModel> findByHouseState(String houseState);//根据房间状态查询

	List<HouseModel> findNotVacant(String houseState);//查找住人的房间
	
	public List<HouseModel> findAllByPage(@Param("houseState")String houseState, @Param("page")int page, @Param("rows")int rows);//分页模式
	
	//多条件查询
	List<HouseModel> findByMutiCondition(@Param("houseName") String houseName, @Param("houseState") String houseState);
	
	void addHouse(HouseModel house);//增加房间
	
	void uodateHouse(HouseModel house);//修改房间
	
	void deleteHouse(HouseModel house);//删除房间
	
	
	
	
}
