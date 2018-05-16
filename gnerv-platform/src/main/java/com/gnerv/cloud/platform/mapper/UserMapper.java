package com.gnerv.cloud.platform.mapper;

import com.gnerv.cloud.platform.entity.User;
import org.apache.ibatis.annotations.Mapper;

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

    /**
     * 插入一个用户
     * @param user
     * @return
     */
    int insertUser(User user);

    int deleteUserByUserId(String userId);

    int updateUserByUserId(User user);

    User selectUserByUserId(String userId);
}
