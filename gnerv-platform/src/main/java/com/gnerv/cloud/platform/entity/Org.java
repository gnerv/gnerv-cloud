package com.gnerv.cloud.platform.entity;

import com.gnerv.cloud.platform.util.UUIDUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * @description: 平台组织机构 实体类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
public class Org implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 默认索引 不可作用于业务
     */
    private Long id;
    /**
     * 组织机构唯一32位UUID
     */
    private String orgId = UUIDUtil.getLowerUUID();
    /**
     * 上级组织机构ID 默认 "0"
     */
    private String pId = "0";
    /**
     * 组织机构编码 唯一
     */
    private String orgCode;
    /**
     * 组织机构名称
     */
    private String orgName;
    /**
     * 组织机构简称
     */
    private String orgAbbreviation;
    /**
     * 组织机构状态 : 0启用 1停用 2锁定 3删除
     */
    private String orgStatus = "0";
    /**
     * 排序号 默认1000
     */
    private Integer orgSort = 1000;
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

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(String orgCode) {
        this.orgCode = orgCode;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getOrgAbbreviation() {
        return orgAbbreviation;
    }

    public void setOrgAbbreviation(String orgAbbreviation) {
        this.orgAbbreviation = orgAbbreviation;
    }

    public String getOrgStatus() {
        return orgStatus;
    }

    public void setOrgStatus(String orgStatus) {
        this.orgStatus = orgStatus;
    }

    public Integer getOrgSort() {
        return orgSort;
    }

    public void setOrgSort(Integer orgSort) {
        this.orgSort = orgSort;
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
        return "Org{" +
                "id=" + id +
                ", orgId='" + orgId + '\'' +
                ", pId='" + pId + '\'' +
                ", orgCode='" + orgCode + '\'' +
                ", orgName='" + orgName + '\'' +
                ", orgAbbreviation='" + orgAbbreviation + '\'' +
                ", orgStatus='" + orgStatus + '\'' +
                ", orgSort=" + orgSort +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                '}';
    }
}
