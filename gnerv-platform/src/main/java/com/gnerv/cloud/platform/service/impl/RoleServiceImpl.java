package com.gnerv.cloud.platform.service.impl;

import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.mapper.MenuMapper;
import com.gnerv.cloud.platform.mapper.RoleMapper;
import com.gnerv.cloud.platform.service.RoleService;
import com.gnerv.cloud.platform.util.BuildMenuTree;
import com.gnerv.cloud.platform.util.BuildRoleTree;
import com.gnerv.cloud.platform.util.BuildTree;
import com.gnerv.cloud.platform.util.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 角色服务 实现类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    RoleMapper roleMapper;

    @Autowired
    MenuMapper menuMapper;

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

    @Override
    public List<Tree<Role>> selectAllRole() {
        List<Role> roles = roleMapper.selectAllRole();
        return BuildRoleTree.getRoleTree(roles, "0");
    }

    @Override
    public List<Tree<Menu>> selectMenuTreeByRoleId(String roleId) {
        List<Menu> menus = new ArrayList<>();
        List<String> menuIds = roleMapper.selectMenuByRoleId(roleId);
        for (String menuId : menuIds) {
            Menu menu = menuMapper.selectMenuByMenuId(menuId);
            menus.add(menu);
        }
        return BuildMenuTree.getMenuTree(menus, "0");
    }

    @Override
    public List<Menu> selectMenuByRoleId(String roleId) {
        List<Menu> menus = new ArrayList<>();
        List<String> menuIds = roleMapper.selectMenuByRoleId(roleId);
        for (String menuId : menuIds) {
            Menu menu = menuMapper.selectMenuByMenuId(menuId);
            menus.add(menu);
        }
        return menus;
    }
}
