package com.gnerv.cloud.platform.mapper;

import com.gnerv.cloud.platform.entity.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

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

    int insertRoleMenu(@Param(value = "roleId") String roleId, @Param(value = "menuIds") List<String> menuIds);

    int deleteRoleByRoleId(String roleId);

    int updateRoleByRoleId(Role role);

    Role selectRoleByRoleId(String roleId);

    List<Role> selectAllRole();

    List<String> selectMenuByRoleId(String roleId);
}
