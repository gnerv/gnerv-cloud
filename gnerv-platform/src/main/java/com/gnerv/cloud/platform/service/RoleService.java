package com.gnerv.cloud.platform.service;

import com.gnerv.cloud.platform.entity.Role;

import java.util.List;

public interface RoleService {

    boolean insertRole(Role role);

    boolean insertRoleMenu(String roleId, List<String> menuIds);

    boolean deleteRoleByRoleId(String roleId);

    boolean updateRoleByRoleId(Role role);

    Role selectRoleByRoleId(String roleId);

}
