package com.neusoft.oa.user.service;

import java.util.List;

import com.neusoft.oa.role.model.RoleModel;
import com.neusoft.oa.user.model.UserModel;

public interface IUserService {
    List<UserModel> findAll();

    void save(UserModel userInfo);

    UserModel findById(String id);

    List<RoleModel> findOtherRoles(String userId);

    void addRoleToUser(String userId, String[] roleIds);
}
