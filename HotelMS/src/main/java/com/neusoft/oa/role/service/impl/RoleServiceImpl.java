package com.neusoft.oa.role.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neusoft.oa.permission.model.PermissionModel;
import com.neusoft.oa.role.mapper.IRoleMapper;
import com.neusoft.oa.role.model.RoleModel;
import com.neusoft.oa.role.service.IRoleService;

@Service("RoleService")
@Transactional
public class RoleServiceImpl implements IRoleService {
	@Autowired
	private IRoleMapper roleMapper;

	@Override
	public void save(RoleModel role) {
		roleMapper.save(role);
	}

	@Override
	public RoleModel findById(String roleId) {
		return roleMapper.findById(roleId);
	}

	@Override
	public List<PermissionModel> findOtherPermissions(String roleId) {
		return roleMapper.findOtherPermissions(roleId);
	}

	@Override
	public void addPermissionToRole(String roleId, String[] permissionIds) {
		for (String permissionId : permissionIds) {
			roleMapper.addPermissionToRole(roleId, permissionId);
		}
	}

	@Override
	public void deleteRoleById(String roleId) {
		// 从user_role表中删除
		roleMapper.deleteFromUser_RoleByRoleId(roleId);
		// 从role_permission表中删除
		roleMapper.deleteFromRole_PermissionByRoleId(roleId);
		// 从role表中删除
		roleMapper.deleteRoleById(roleId);
	}

	@Override
	public List<RoleModel> findAll() {
		return roleMapper.findAll();
	}
}
