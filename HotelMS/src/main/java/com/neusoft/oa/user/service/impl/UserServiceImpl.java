package com.neusoft.oa.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.role.model.RoleModel;
import com.neusoft.oa.user.mapper.IUserMapper;
import com.neusoft.oa.user.model.UserModel;
import com.neusoft.oa.user.service.IUserService;

@Service("UserService")
@Transactional
public class UserServiceImpl implements IUserService{

    @Autowired
	private IUserMapper userMapper=null;

    @Autowired

    @Override
    public void addRoleToUser(String userId, String[] roleIds) {

        for(String roleId:roleIds){
            userMapper.addRoleToUser(userId,roleId);
        }
    }

    @Override
    public List<RoleModel> findOtherRoles(String userId) {
        return userMapper.findOtherRoles(userId);
    }

    @Override
    public UserModel findById(String id){

        return userMapper.findById(id);
    }


    @Override
    public List<UserModel> findAll() {
        return userMapper.findAll();
    }

	@Override
	public void save(UserModel userInfo) {
		// TODO Auto-generated method stub
		userMapper.save(userInfo);
	}


}
