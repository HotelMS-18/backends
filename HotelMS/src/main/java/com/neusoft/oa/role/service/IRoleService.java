package com.neusoft.oa.role.service;

import java.util.List;

import com.neusoft.oa.permission.model.PermissionModel;
import com.neusoft.oa.role.model.RoleModel;

public interface IRoleService {
    public List<RoleModel> findAll();

    void save(RoleModel role);

    RoleModel findById(String roleId);

    List<PermissionModel> findOtherPermissions(String roleId);

    void addPermissionToRole(String roleId, String[] permissionIds);

    void deleteRoleById(String roleId);
}
