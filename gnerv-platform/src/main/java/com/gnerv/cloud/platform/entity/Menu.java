package com.gnerv.cloud.platform.entity;

import com.gnerv.cloud.platform.util.UUIDUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 平台菜单 实体类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认索引 不可作用于业务
     */
    private Long id;
    /**
     * 菜单唯一32位UUID
     */
    private String menuId = UUIDUtil.getLowerUUID();
    /**
     * 上级菜单 默认0
     */
    private String pId = "0";
    /**
     * 菜单名称
     */
    private String menuName;
    /**
     * 菜单类型 1目录 2菜单 3按钮
     */
    private String menuType = "1";
    /**
     * 菜单请求地址 /xxx/xxx
     */
    private String menuUrl;
    /**
     * 菜单授权 模块:功能:方法  platform:menu:createMenu
     */
    private String menuPermission;
    /**
     * 菜单图标
     */
    private String menuIcon;
    /**
     * 用户状态 : 0启用 1停用 2锁定 3删除
     */
    private String menuStatus = "0";
    /**
     * 排序号 默认 1000
     */
    private Integer menuSort = 1000;
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

    public String getMenuId() {
        return menuId;
    }

    public void setMenuId(String menuId) {
        this.menuId = menuId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuPermission() {
        return menuPermission;
    }

    public void setMenuPermission(String menuPermission) {
        this.menuPermission = menuPermission;
    }

    public String getMenuIcon() {
        return menuIcon;
    }

    public void setMenuIcon(String menuIcon) {
        this.menuIcon = menuIcon;
    }

    public String getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(String menuStatus) {
        this.menuStatus = menuStatus;
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
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
        return "Menu{" +
                "id=" + id +
                ", menuId='" + menuId + '\'' +
                ", pId='" + pId + '\'' +
                ", menuName='" + menuName + '\'' +
                ", menuType='" + menuType + '\'' +
                ", menuUrl='" + menuUrl + '\'' +
                ", menuPermission='" + menuPermission + '\'' +
                ", menuIcon='" + menuIcon + '\'' +
                ", menuStatus='" + menuStatus + '\'' +
                ", menuSort=" + menuSort +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
