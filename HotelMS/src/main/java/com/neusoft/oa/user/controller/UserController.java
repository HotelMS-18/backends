package com.neusoft.oa.user.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.oa.role.model.RoleModel;
import com.neusoft.oa.user.model.UserModel;
import com.neusoft.oa.user.service.IUserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	@Autowired
	private IUserService userService;

	// 查询指定id的用户
	@RequestMapping("/findById.do")
	public ModelAndView findById(String id) throws Exception {
		ModelAndView mv = new ModelAndView();
		UserModel userInfo = userService.findById(id);
		mv.addObject("user", userInfo);
		mv.setViewName("user-show1");
		return mv;
	}

	// 用户添加
	@RequestMapping("/save.do")
	public String save(UserModel userInfo) throws Exception {
		userService.save(userInfo);
		return "redirect:findAll.do";
	}

	@RequestMapping("/findAll.do")
	public ModelAndView findAll() throws Exception {
		ModelAndView mv = new ModelAndView();
		List<UserModel> userList = userService.findAll();
		mv.addObject("userList", userList);
		mv.setViewName("user-list");
		return mv;
	}

	// 给用户添加角色
	@RequestMapping("/addRoleToUser.do")
	public String addRoleToUser(@RequestParam(name = "userId", required = true) String userId,
			@RequestParam(name = "ids", required = true) String[] roleIds) {
		userService.addRoleToUser(userId, roleIds);
		return "redirect:findAll.do";
	}

	// 查询用户以及用户可以添加的角色
	@RequestMapping("/findUserByIdAndAllRole.do")
	public ModelAndView findUserByIdAndAllRole(@RequestParam(name = "id", required = true) String userid)
			throws Exception {
		ModelAndView mv = new ModelAndView();
		// 1.根据用户id查询用户
		UserModel userInfo = userService.findById(userid);
		// 2.根据用户id查询可以添加的角色
		List<RoleModel> otherRoles = userService.findOtherRoles(userid);
		mv.addObject("user", userInfo);
		mv.addObject("roleList", otherRoles);
		mv.setViewName("user-role-add");
		return mv;
	}
}
