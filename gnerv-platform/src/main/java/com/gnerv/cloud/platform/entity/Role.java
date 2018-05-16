package com.gnerv.cloud.platform.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 平台角色 实体类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认索引 不可作用于业务
     */
    private Long id;
    /**
     * 角色唯一32位UUID
     */
    private String roleId;
    /**
     * 上级角色ID 默认 "0"
     */
    private String pId = "0";
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色简介
     */
    private String roleNotes;
    /**
     * 角色状态 : 0启用 1停用 2锁定 3删除
     */
    private String roleStatus;
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

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleNotes() {
        return roleNotes;
    }

    public void setRoleNotes(String roleNotes) {
        this.roleNotes = roleNotes;
    }

    public String getRoleStatus() {
        return roleStatus;
    }

    public void setRoleStatus(String roleStatus) {
        this.roleStatus = roleStatus;
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
        return "Role{" +
                "id=" + id +
                ", roleId='" + roleId + '\'' +
                ", pId='" + pId + '\'' +
                ", roleName='" + roleName + '\'' +
                ", roleNotes='" + roleNotes + '\'' +
                ", roleStatus='" + roleStatus + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
