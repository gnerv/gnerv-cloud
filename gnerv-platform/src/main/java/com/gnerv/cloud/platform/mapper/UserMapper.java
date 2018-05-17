package com.gnerv.cloud.platform.mapper;

import com.gnerv.cloud.platform.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 平台用户表 Mapper 接口
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
@Mapper
public interface UserMapper {

    int insertUser(User user);

    int insertUserOrg(@Param(value = "userId") String userId, @Param(value = "orgId") String orgId);

    int insertUserRole(@Param(value = "userId") String userId, @Param(value = "roleId") String roleId);

    int deleteUserByUserId(String userId);

    int updateUserByUserId(User user);

    User selectUserByUserId(String userId);
}
