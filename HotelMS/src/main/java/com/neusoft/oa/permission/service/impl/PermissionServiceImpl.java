package com.neusoft.oa.permission.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.oa.permission.mapper.IPermissionMapper;
import com.neusoft.oa.permission.model.PermissionModel;
import com.neusoft.oa.permission.service.IPermissionService;

@Service
public class PermissionServiceImpl implements IPermissionService {
	@Autowired
	private IPermissionMapper permissionMapper;

	@Override
	public void save(PermissionModel permission){
		permissionMapper.save(permission);
	}

	@Override
	public List<PermissionModel> findAll()  {
		return permissionMapper.findAll();
	}

}
