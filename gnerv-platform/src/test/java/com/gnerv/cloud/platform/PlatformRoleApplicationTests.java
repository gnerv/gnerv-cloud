package com.gnerv.cloud.platform;

import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.entity.User;
import com.gnerv.cloud.platform.service.RoleService;
import com.gnerv.cloud.platform.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformRoleApplicationTests {

	@Autowired
    RoleService roleService;

	@Test
	public void contextLoads() {
    }

    @Test
    public void insertRoleTest() {
	    for (int i =0; i <= 10; i++) {
            Role role = new Role();
            role.setRoleId("10001" + i);
            role.setpId("0");
            role.setRoleName("1级角色10001" + i);
            role.setRoleNotes("1级角色10001" + i);
            role.setRoleStatus("0");
            boolean b = roleService.insertRole(role);
            System.out.println(b);
        }
    }

    @Test
    public void deleteRoleTest() {
        boolean b = roleService.deleteRoleByRoleId("100013");
        System.out.println(b);
    }

    @Test
    public void updateRoleTest() {
        Role role = new Role();
        int i = 5;
        role.setRoleId("10001" + i);
        role.setpId("10001");
        role.setRoleName("改1级角色10001" + i);
        role.setRoleNotes("改1级角色10001" + i);
        role.setRoleStatus("0");
        boolean b = roleService.updateRoleByRoleId(role);
        System.out.println(b);
    }

    @Test
    public void selectRoleTest() {
        Role role = roleService.selectRoleByRoleId("100015");
        System.out.println(role);
    }

}
