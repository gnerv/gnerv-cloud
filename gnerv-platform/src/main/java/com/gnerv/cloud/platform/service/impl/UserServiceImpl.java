package com.gnerv.cloud.platform.service.impl;

import com.gnerv.cloud.platform.entity.User;
import com.gnerv.cloud.platform.mapper.UserMapper;
import com.gnerv.cloud.platform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 用户服务 实现类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean insertUser(User user) {
        int i = userMapper.insertUser(user);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteUserByUserId(String userId) {
        int i = userMapper.deleteUserByUserId(userId);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public boolean updateUserByUserId(User user) {
        int i = userMapper.updateUserByUserId(user);
        if (i == 1) {
            return true;
        }
        return false;
    }

    @Override
    public User selectUserByUserId(String userId) {
        User user = userMapper.selectUserByUserId(userId);
        return user;
    }
}
