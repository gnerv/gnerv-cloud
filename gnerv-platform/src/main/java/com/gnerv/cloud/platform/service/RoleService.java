package com.gnerv.cloud.platform.service;

import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.util.Tree;

import java.util.List;

public interface RoleService {

    boolean insertRole(Role role);

    boolean insertRoleMenu(String roleId, List<String> menuIds);

    boolean deleteRoleByRoleId(String roleId);

    boolean updateRoleByRoleId(Role role);

    Role selectRoleByRoleId(String roleId);

    List<Tree<Role>> selectAllRole();

    List<Tree<Menu>> selectMenuTreeByRoleId(String roleId);

    List<Menu> selectMenuByRoleId(String roleId);
}
