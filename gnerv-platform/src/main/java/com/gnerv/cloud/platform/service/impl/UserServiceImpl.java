package com.gnerv.cloud.platform.service.impl;

import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.entity.Org;
import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.entity.User;
import com.gnerv.cloud.platform.mapper.RoleMapper;
import com.gnerv.cloud.platform.mapper.UserMapper;
import com.gnerv.cloud.platform.service.OrgService;
import com.gnerv.cloud.platform.service.UserService;
import com.gnerv.cloud.platform.util.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 用户服务 实现类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    OrgService orgService;

    @Autowired
    RoleMapper roleMapper;

    @Override
    public boolean insertUser(User user) {
        int i = userMapper.insertUser(user);
        List<Org> orgs = user.getOrgs();
        for (Org org : orgs) {
            insertUserOrg(user.getUserId(), org.getOrgId());
        }
        return i == 1 ? true : false;
    }

    @Override
    public boolean insertUserOrg(String userId, String orgId) {
        int i = userMapper.insertUserOrg(userId, orgId);
        return i == 1 ? true : false;
    }

    @Override
    public boolean insertUserRole(String userId, String roleId) {
        int i = userMapper.insertUserRole(userId, roleId);
        return i == 1 ? true : false;
    }

    @Override
    public boolean deleteUserByUserId(String userId) {
        int i = userMapper.deleteUserByUserId(userId);
        return i == 1 ? true : false;
    }

    @Override
    public boolean updateUserByUserId(User user) {
        int i = userMapper.updateUserByUserId(user);
        return i == 1 ? true : false;
    }

    @Override
    public User selectUserByUserId(String userId) {
        User user = userMapper.selectUserByUserId(userId);
        return user;
    }

    @Override
    public User selectUserByAccount(String account) {
        User user = userMapper.selectUserByAccount(account);
        return user;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> users = userMapper.selectAllUser();
        return users;
    }

    @Override
    public List<Role> selectRoleByUserId(String userId) {
        List<String> roleIds = userMapper.selectRoleByUserId();
        List<Role> roles = new ArrayList<>();
        for (String roleId : roleIds) {
            Role role = roleMapper.selectRoleByRoleId(roleId);
            roles.add(role);
        }
        return roles;
    }

    @Override
    public List<Tree<Menu>> selectMenuTreeByUserId(String userId) {
        List<String> menuIds = userMapper.selectMenuByUserId(userId);

        return null;
    }


}
