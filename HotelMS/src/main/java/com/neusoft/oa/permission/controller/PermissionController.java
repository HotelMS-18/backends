package com.neusoft.oa.permission.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.neusoft.oa.permission.model.PermissionModel;
import com.neusoft.oa.permission.service.IPermissionService;

@RestController
@RequestMapping(value="/permission")
public class PermissionController {

	@Autowired
    private IPermissionService permissionService;

    @RequestMapping("/save")
    public String save(PermissionModel permission) throws Exception {
        permissionService.save(permission);
        return "redirect:findAll";
    }
    @RequestMapping("/findAll")
    public ModelAndView findAll() throws Exception {
        ModelAndView mv=new ModelAndView();
        List<PermissionModel> permissionList = permissionService.findAll();
        mv.addObject("permissionList",permissionList);
        mv.setViewName("permission-list");
        return mv;
    }
}
