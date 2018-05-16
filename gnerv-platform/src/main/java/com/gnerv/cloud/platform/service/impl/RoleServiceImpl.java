package com.gnerv.cloud.platform.service.impl;

import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.mapper.RoleMapper;
import com.gnerv.cloud.platform.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 角色服务 实现类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Override
    public boolean insertRole(Role role) {
        int i = roleMapper.insertRole(role);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteRoleByRoleId(String roleId) {
        int i = roleMapper.deleteRoleByRoleId(roleId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateRoleByRoleId(Role role) {
        int i = roleMapper.updateRoleByRoleId(role);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public Role selectRoleByRoleId(String roleId) {
        Role role = roleMapper.selectRoleByRoleId(roleId);
        return role;
    }
}
