package com.gnerv.cloud.platform;

import com.gnerv.cloud.platform.entity.Org;
import com.gnerv.cloud.platform.entity.User;
import com.gnerv.cloud.platform.service.OrgService;
import com.gnerv.cloud.platform.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformOrgApplicationTests {

	@Autowired
    OrgService orgService;

	@Test
	public void contextLoads() {
	}

    @Test
    public void insertOrgTest() {
        for (int i = 1; i < 10; i++) {
            Org org = new Org();
            org.setOrgId("10001" + i);
            org.setpId("0");
            org.setOrgCode("10001" + i);
            org.setOrgName("1级组织10001" + i);
            org.setOrgAbbreviation("1级组织10001" + i);
            org.setOrgStatus("0");
            org.setOrgSort(1000);
            boolean b = orgService.insertOrg(org);
            System.out.println(b);
        }
    }

    @Test
    public void deleteOrgTest() {
        String orgId = "100012";
        boolean b = orgService.deleteOrgByOrgId(orgId);
        System.out.println(b);
    }

    @Test
    public void updateOrgTest() {
        Org org = new Org();
        String i = "3";
        org.setOrgId("10001" + i);
        org.setpId("10001");
        org.setOrgCode("改10001" + i);
        org.setOrgName("改1级组织10001" + i);
        org.setOrgAbbreviation("改1级组织10001" + i);
        org.setOrgStatus("0");
        org.setOrgSort(1000);
        boolean b = orgService.updateOrgByOrgId(org);
        System.out.println(b);
    }


    @Test
    public void selectOrgTest() {
        Org org = orgService.selectOrgByOrgId("100014");
        System.out.println(org);
    }

}
