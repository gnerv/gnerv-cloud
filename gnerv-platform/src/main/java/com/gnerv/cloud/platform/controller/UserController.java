package com.gnerv.cloud.platform.controller;

import com.gnerv.cloud.platform.common.PlatformR;
import com.gnerv.cloud.platform.util.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户
 * @author: Gnerv LiGen
 * @date: 2018-05-18
 **/
@RestController
@RequestMapping(value = "/platform/user")
public class UserController {

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public PlatformR add(String account, String password) {

        return PlatformR.ok();
    }

}
