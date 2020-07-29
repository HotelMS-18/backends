package com.neusoft.oa.role.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.oa.permission.model.PermissionModel;
import com.neusoft.oa.role.model.RoleModel;

@Mapper
public interface IRoleMapper {
	public List<RoleModel> findRoleByUserId(String userId);

	public List<RoleModel> findAll();

	void save(RoleModel role);

	RoleModel findById(String roleId);

	List<PermissionModel> findOtherPermissions(String roleId);

	void addPermissionToRole(@Param("roleId") String roleId, @Param("permissionId") String permissionId);

	void deleteFromUser_RoleByRoleId(String roleId);

	void deleteFromRole_PermissionByRoleId(String roleId);

	void deleteRoleById(String roleId);
}
