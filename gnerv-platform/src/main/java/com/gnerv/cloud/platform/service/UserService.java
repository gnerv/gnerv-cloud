package com.gnerv.cloud.platform.service;

import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.entity.User;
import com.gnerv.cloud.platform.util.Tree;

import java.util.List;

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

    User selectUserByAccount(String account);

    List<User> selectAllUser();

    List<Role> selectRoleByUserId(String userId);

    List<Tree<Menu>> selectMenuTreeByUserId(String userId);
}
