package com.gnerv.cloud.platform.controller;

import com.gnerv.cloud.platform.common.PlatformR;
import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.service.RoleService;
import com.gnerv.cloud.platform.service.UserService;
import com.gnerv.cloud.platform.util.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @description: 用户
 * @author: Gnerv LiGen
 * @date: 2018-05-18
 **/
@RestController
@RequestMapping(value = "/platform/user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/menu", method = RequestMethod.POST)
    public PlatformR add(String userId) {
        List<Role> roles = userService.selectRoleByUserId(userId);
        for (Role role : roles) {
            List<Menu> menus = roleService.selectMenuByRoleId(role.getRoleId());

        }




        return PlatformR.ok();
    }

}
