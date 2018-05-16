package com.gnerv.cloud.platform.service;

import com.gnerv.cloud.platform.entity.Role;

public interface RoleService {
    boolean insertRole(Role role);

    boolean deleteRoleByRoleId(String roleId);

    boolean updateRoleByRoleId(Role role);

    Role selectRoleByRoleId(String roleId);
}
