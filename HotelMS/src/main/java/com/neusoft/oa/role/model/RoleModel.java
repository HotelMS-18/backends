package com.neusoft.oa.role.model;

import java.util.List;


import org.apache.ibatis.type.Alias;

import com.neusoft.oa.permission.model.PermissionModel;
import com.neusoft.oa.user.model.UserModel;

@Alias("Role")
public class RoleModel {
	private String rid;
	private String roleName;
	private String roleDesc;
	private List<PermissionModel> permissions;
	private List<UserModel> users;

	public String getId() {
		return rid;
	}

	public void setId(String id) {
		this.rid = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDesc() {
		return roleDesc;
	}

	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}

	public List<PermissionModel> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<PermissionModel> permissions) {
		this.permissions = permissions;
	}

	public List<UserModel> getUsers() {
		return users;
	}

	public void setUsers(List<UserModel> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Role{" + "id='" + rid + '\'' + ", roleName='" + roleName + '\'' + ", roleDesc='" + roleDesc + '\''
				+ ", permissions=" + permissions + ", users=" + users + '}';
	}
}
