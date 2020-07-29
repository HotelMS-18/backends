package com.neusoft.oa.user.model;

import java.util.List;


import org.apache.ibatis.type.Alias;

import com.neusoft.oa.role.model.RoleModel;

@Alias("User")
public class UserModel {
	private String uid;
	private String userName;
	private String email;
	private String password;
	private String phoneNum;
	private int status;
	private String statusStr;
	private List<RoleModel> roles;

	public String getId() {
		return uid;
	}

	public void setId(String id) {
		this.uid = id;
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getStatusStr() {
		// 状态0 未开启 1 开启
		if (status == 0) {
			statusStr = "未开启";
		} else if (status == 1) {
			statusStr = "开启";
		}
		return statusStr;
	}

	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}

	public List<RoleModel> getRoles() {
		return roles;
	}

	public void setRoles(List<RoleModel> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "UserInfo{" + "id='" + uid + '\'' + ", username='" + userName + '\'' + ", email='" + email + '\''
				+ ", password='" + password + '\'' + ", phoneNum='" + phoneNum + '\'' + ", status=" + status
				+ ", statusStr='" + statusStr + '\'' + ", roles=" + roles + '}';
	}
}
