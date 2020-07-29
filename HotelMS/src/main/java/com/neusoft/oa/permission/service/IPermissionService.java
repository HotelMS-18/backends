package com.neusoft.oa.permission.service;

import java.util.List;

import com.neusoft.oa.permission.model.PermissionModel;

public interface IPermissionService {
    public List<PermissionModel> findAll();

    void save(PermissionModel permission);
}
