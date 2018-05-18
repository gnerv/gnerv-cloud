package com.gnerv.cloud.platform.config;

import com.gnerv.cloud.platform.entity.User;
import com.gnerv.cloud.platform.service.MenuService;
import com.gnerv.cloud.platform.service.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description: 授权验证
 * @author: Gnerv LiGen
 * @date: 2018-05-18
 **/
@Component
public class ShiroUserRealm extends AuthorizingRealm {
	@Autowired
	private UserService userService;
	@Autowired
	private MenuService menuService;

	/**
	 * 授权(验证权限时调用)
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		return info;
	}

	/**
	 * 认证(登录时调用)
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
        String account = (String) token.getPrincipal();
        String password = new String((char[]) token.getCredentials());
        // 查询用户信息
        User user = userService.selectUserByAccount(account);
        // 账号不存在
        if (user == null) {
            throw new UnknownAccountException("账号或密码不正确");
        }

        // 密码错误
        if (!password.equals(user.getPassword())) {
            throw new IncorrectCredentialsException("账号或密码不正确");
        }

        // 账号锁定
        if (user.getUserStatus() == "1") {
            throw new LockedAccountException("账号已被锁定,请联系管理员");
        }

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,
                password, getName());
        return info;
	}

}
