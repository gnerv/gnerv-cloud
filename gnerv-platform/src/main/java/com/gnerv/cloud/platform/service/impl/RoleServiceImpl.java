package com.gnerv.cloud.platform.service.impl;

import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.mapper.RoleMapper;
import com.gnerv.cloud.platform.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return i == 1 ? true : false;
    }

    @Override
    public boolean insertRoleMenu(String roleId, List<String> menuIds) {
        int i = roleMapper.insertRoleMenu(roleId, menuIds);
        return i == menuIds.size() ? true : false;
    }

    @Override
    public boolean deleteRoleByRoleId(String roleId) {
        int i = roleMapper.deleteRoleByRoleId(roleId);
        return i == 1 ? true : false;
    }

    @Override
    public boolean updateRoleByRoleId(Role role) {
        int i = roleMapper.updateRoleByRoleId(role);
        return i == 1 ? true : false;
    }

    @Override
    public Role selectRoleByRoleId(String roleId) {
        Role role = roleMapper.selectRoleByRoleId(roleId);
        return role;
    }
}
