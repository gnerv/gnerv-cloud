package com.gnerv.cloud.platform.service;

import com.gnerv.cloud.platform.entity.User;

/**
 * @description: 用户服务 接口类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
public interface UserService {

    boolean insertUser(User user);

    boolean insertUserOrg(String userId, String orgId);

    boolean insertUserRole(String userId, String roleId);

    boolean deleteUserByUserId(String userId);

    boolean updateUserByUserId(User user);

    User selectUserByUserId(String userId);
}
