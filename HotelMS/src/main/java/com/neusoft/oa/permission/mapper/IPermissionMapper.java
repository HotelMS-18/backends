package com.neusoft.oa.permission.mapper;

import java.util.List;

import com.neusoft.oa.permission.model.PermissionModel;

public interface IPermissionMapper {
	public List<PermissionModel> findPermissionByRoleId(String id);

	List<PermissionModel> findAll();

	void save(PermissionModel permission);
}
