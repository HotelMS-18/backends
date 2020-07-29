package com.neusoft.oa.house.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import com.github.pagehelper.PageHelper;
import com.neusoft.oa.house.mapper.IHouseMapper;
import com.neusoft.oa.house.model.HouseModel;
import com.neusoft.oa.house.service.IHouseService;

@Service("HouseService")
@Transactional
public class HouseServiceImpl implements IHouseService{

	@Autowired
	private IHouseMapper houseMapper=null;

	@Override
	public List<HouseModel> findAllVacant() {
		// TODO Auto-generated method stub
		return houseMapper.findAllVacant("空房");
	}

	@Override
	public List<HouseModel> findByName(String houseName) {
		// TODO Auto-generated method stub
		return houseMapper.findByName(houseName, "空房");
	}

	@Override
	public HouseModel findById(int hid) {
		// TODO Auto-generated method stub
		return houseMapper.findById(hid);
	}

	@Override
	public List<HouseModel> findAllHouse() {
		// TODO Auto-generated method stub
		return  houseMapper.findAllHouse();
	}

	@Override
	public int findVacantCount() {
		// TODO Auto-generated method stub
		return houseMapper.findVacantCount("空房");
	}

	@Override
	public int findPresentCount() {
		// TODO Auto-generated method stub
		return houseMapper.findPreserveCount("预订");
	}

	@Override
	public int findNotVacantCount() {
		// TODO Auto-generated method stub
		return houseMapper.findPeopleCount("住人");
	}

	@Override
	public List<HouseModel> findByHouseName(String houseName) {
		// TODO Auto-generated method stub
		return houseMapper.findByHouseName(houseName);
	}

	@Override
	public List<HouseModel> findByHouseState(String houseState) {
		// TODO Auto-generated method stub
		return houseMapper.findByHouseState(houseState);
	}

	@Override
	public List<HouseModel> findByMutiCondition(String houseName, String houseState) {
		// TODO Auto-generated method stub
		return houseMapper.findByMutiCondition(houseName,houseState);
	}

	@Override
	public void updateToPeople(int hid) {
		// TODO Auto-generated method stub
		houseMapper.updateToNotVacant(hid, "住人");
	}

	@Override
	public List<HouseModel> findNotVacant() {
		// TODO Auto-generated method stub
		List<HouseModel> list = houseMapper.findNotVacant("住人");
		List<HouseModel> list1 = houseMapper.findNotVacant("预订");
		for(int i = 0; i < list1.size(); i++) {
			list.add(list1.get(i));
		}
		return list;
	}

	@Override
	public void updateToVacant(int hid) {
		// TODO Auto-generated method stub
		houseMapper.updateToVacant(hid, "空房");
	}

	@Override
	public void updateToPresent(int hid) {
		houseMapper.updateToReservedById(hid, "预订");
	}
	
	@Override
	public List<HouseModel> findAllByPage(int page, int rows) {
		// TODO Auto-generated method stub
		//PageHelper.startPage(page,rows);
		List<HouseModel> list = houseMapper.findAllByPage("空房", page, rows);
        return list;
	}

	@Override
	public void addHouse(HouseModel house) {
		// TODO Auto-generated method stub
		houseMapper.addHouse(house);
	}

	@Override
	public void updateHouse(HouseModel house) {
		// TODO Auto-generated method stub
		houseMapper.addHouse(house);
	}

	@Override
	public void deleteHouse(HouseModel house) {
		// TODO Auto-generated method stub
		houseMapper.addHouse(house);
	}
	
	
}
