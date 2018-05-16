package com.gnerv.cloud.platform.service;

import com.gnerv.cloud.platform.entity.Org;

/**
 * @description: 组织机构服务 接口类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
public interface OrgService {

    boolean insertOrg(Org org);

    boolean deleteOrgByOrgId(String orgId);

    boolean updateOrgByOrgId(Org org);

    Org selectOrgByOrgId(String orgId);
}
