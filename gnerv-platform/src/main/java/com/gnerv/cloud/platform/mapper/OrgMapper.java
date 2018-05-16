package com.gnerv.cloud.platform.mapper;

import com.gnerv.cloud.platform.entity.Org;
import com.gnerv.cloud.platform.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 平台组织机构表 Mapper 接口
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
@Mapper
public interface OrgMapper {

    int insertOrg(Org org);

    int deleteOrgByOrgId(String orgId);

    int updateOrgByOrgId(Org org);

    Org selectOrgByOrgId(String orgId);
}
