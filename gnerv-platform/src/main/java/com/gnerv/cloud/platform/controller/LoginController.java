package com.gnerv.cloud.platform.controller;

import com.gnerv.cloud.platform.common.PlatformR;
import com.gnerv.cloud.platform.util.ShiroUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

/**
 * @description: 登录
 * @author: Gnerv LiGen
 * @date: 2018-05-18
 **/
@RestController
@RequestMapping(value = "/sys")
public class LoginController {

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public PlatformR login(String account, String password) {
        try{
            Subject subject = ShiroUtils.getSubject();
            //sha256加密
            password = new Sha256Hash(password).toHex();
            UsernamePasswordToken token = new UsernamePasswordToken(account, password);
            subject.login(token);
        }catch (UnknownAccountException e) {
            return PlatformR.error(e.getMessage());
        }catch (IncorrectCredentialsException e) {
            return PlatformR.error(e.getMessage());
        }catch (LockedAccountException e) {
            return PlatformR.error(e.getMessage());
        }catch (AuthenticationException e) {
            return PlatformR.error("账户验证失败");
        }

        return PlatformR.ok();
    }

    /**
     * 退出
     */
    @RequestMapping(value = "logout", method = RequestMethod.GET)
    public PlatformR logout() {
        ShiroUtils.logout();
        return PlatformR.ok();
    }
}
