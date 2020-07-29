package com.neusoft.oa.house.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.oa.house.model.HouseModel;
import com.neusoft.oa.house.service.IHouseService;

@RestController
@RequestMapping(value="/house")
public class HouseController {

	@Autowired
	private IHouseService houseService=null;
	

	//查询全部空房按照房型
    @RequestMapping("/findAllVacant")
    public List<HouseModel> findAllVacant(){
    	return houseService.findAllVacant();
    }
	
   //根据房型查询全部空闲房间
    @RequestMapping("/findByName")
    public List<HouseModel> findByName(String houseName){
    	return houseService.findByName(houseName);
    }
    
    //根据id查找房间
    @RequestMapping("/findById")
    public HouseModel findById(int hid) {
    	return houseService.findById(hid);
    }
    
   //查询房型首页信息
    @RequestMapping("/findAllHouse")
    public List<HouseModel> findAllHouse(){
    	return houseService.findAllHouse();
    }
    
   //根据房间型号查找相应房间
    @RequestMapping("/findByHouseName")
    public List<HouseModel> findByHouseName(String houseName){
    	return houseService.findByHouseName(houseName);
    }
    
   //多条件查询
    @RequestMapping("/findByMutiCondition")
    public List<HouseModel> findByMuyiCondition(String houseName, String houseState){
    	return houseService.findByMutiCondition(houseName, houseState);
    }
    
    //根据房间状态查询
    @RequestMapping("/findByHouseState")
    public List<HouseModel> findByHouseState(String houseState){
    	return houseService.findByHouseState(houseState);
    }
    
    //查找非空房间
    @RequestMapping("/findNotVacant")
    public List<HouseModel> findNotVacant(){
    	return houseService.findNotVacant();
    }
    
    //修改房间为空
    @PostMapping("/updateToVacant")
    public void updateToVacant(int hid) {
    	houseService.updateToVacant(hid);
    }
    
    //修改房间为住人
    @PostMapping("/updateToNotVacant")
    public void updateToNotVacant(int hid) {
    	houseService.updateToPeople(hid);;
    }
    
  //查询全部房间(分页查询)
    @RequestMapping("/findAllByPage")
    public List<HouseModel> findAllByPage(@RequestParam(name = "page" , required = true,defaultValue = "1") int page, @RequestParam(name = "size",required = true,defaultValue = "5") int size){
    	return houseService.findAllByPage(page, size);
    }
    
    //增加房间
    @PostMapping("/addHouse")
    public void addHouse(HouseModel house) {
    	houseService.addHouse(house);
    }
    
    //修改房间状态为预订
    @PostMapping("/updateToReserved")
    public void updateHouse(int hid) {
    	houseService.updateToPresent(hid);
    }
    
    
    
    
}
