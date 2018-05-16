package com.gnerv.cloud.platform.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 平台用户 实体类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认索引 不可作用于业务
     */
    private Long id;
    /**
     * 用户唯一32位UUID
     */
    private String userId;
    /**
     * 登陆账号 唯一
     */
    private String account;
    /**
     * 登陆密码
     */
    private String password;
    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户状态 : 0启用 1停用 2锁定 3删除
     */
    private String userStatus;
    /**
     * 创建时间
     */
    private Date gmtCreate;
    /**
     * 修改时间
     */
    private Date gmtModified;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    @Override
    public String toString() {
        return "PlatformUser{" +
                ", id=" + id +
                ", userId=" + userId +
                ", account=" + account +
                ", password=" + password +
                ", userName=" + userName +
                ", userStatus=" + userStatus +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                "}";
    }
}
