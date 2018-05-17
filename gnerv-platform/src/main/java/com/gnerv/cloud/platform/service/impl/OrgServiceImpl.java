package com.gnerv.cloud.platform.service.impl;

import com.gnerv.cloud.platform.entity.Org;
import com.gnerv.cloud.platform.mapper.OrgMapper;
import com.gnerv.cloud.platform.service.OrgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @description: 组织机构服务 实现类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
@Service
public class OrgServiceImpl implements OrgService {

    @Autowired
    OrgMapper orgMapper;


    @Override
    public boolean insertOrg(Org org) {
        int i = orgMapper.insertOrg(org);
        return i == 1 ? true : false;
    }

    @Override
    public boolean deleteOrgByOrgId(String orgId) {
        int i = orgMapper.deleteOrgByOrgId(orgId);
        return i == 1 ? true : false;
    }

    @Override
    public boolean updateOrgByOrgId(Org org) {
        int i = orgMapper.updateOrgByOrgId(org);
        return i == 1 ? true : false;
    }

    @Override
    public Org selectOrgByOrgId(String orgId) {
        Org org = orgMapper.selectOrgByOrgId(orgId);
        return org;
    }
}
