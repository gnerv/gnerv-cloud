package com.gnerv.cloud.platform.mapper;

import com.gnerv.cloud.platform.entity.Role;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 平台角色表 Mapper 接口
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
@Mapper
public interface RoleMapper {

    int insertRole(Role role);

    int deleteRoleByRoleId(String roleId);

    int updateRoleByRoleId(Role role);

    Role selectRoleByRoleId(String roleId);
}
