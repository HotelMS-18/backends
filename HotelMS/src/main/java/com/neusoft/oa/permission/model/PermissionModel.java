package com.neusoft.oa.permission.model;

import java.util.List;

import org.apache.ibatis.type.Alias;

import com.neusoft.oa.role.model.RoleModel;
@Alias("Permission")
public class PermissionModel {
	private Integer pid;
    private String permissionName;
    private String url;
    private List<RoleModel> roles;

    public Integer getId() {
        return pid;
    }

    public void setId(Integer id) {
        this.pid = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<RoleModel> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleModel> roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "Permission{" +
                "id=" + pid +
                ", permissionName='" + permissionName + '\'' +
                ", url='" + url + '\'' +
                ", roles=" + roles +
                '}';
    }
}
