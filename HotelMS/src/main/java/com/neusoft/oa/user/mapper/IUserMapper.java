package com.neusoft.oa.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.neusoft.oa.role.model.RoleModel;
import com.neusoft.oa.user.model.UserModel;

@Mapper
public interface IUserMapper {
	public UserModel findByUsername(String username);

	List<UserModel> findAll();

	void save(UserModel userInfo);

	UserModel findById(String id);

	List<RoleModel> findOtherRoles(String userId);

    void addRoleToUser(@Param("userId") String userId, @Param("roleId") String roleId);
}
