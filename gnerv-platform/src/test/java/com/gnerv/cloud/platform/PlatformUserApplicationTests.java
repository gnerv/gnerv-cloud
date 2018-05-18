package com.gnerv.cloud.platform;

import com.gnerv.cloud.platform.entity.Org;
import com.gnerv.cloud.platform.entity.Role;
import com.gnerv.cloud.platform.entity.User;
import com.gnerv.cloud.platform.service.OrgService;
import com.gnerv.cloud.platform.service.RoleService;
import com.gnerv.cloud.platform.service.UserService;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformUserApplicationTests {

	@Autowired
    UserService userService;

    @Autowired
    OrgService orgService;

    @Autowired
    RoleService roleService;

	@Test
	public void contextLoads() {
	}

    @Test
    public void insertUserTest() {
        User user = new User();
        for (int i = 0; i <= 10; i++) {
            user.setUserId("11006" + i);
            user.setAccount("user6" + i);
            user.setPassword("user6" + i);
            user.setUserName("user6" + i);
            user.setUserStatus("0");
            boolean b = userService.insertUser(user);
            System.out.println(b);
        }
    }

    @Test
    public void insertUserOrgsTest() {
        User user = new User();
        user.setUserId("110081");
        user.setAccount("user81");
        user.setPassword("user81");
        user.setUserName("user81");
        user.setUserStatus("0");
        Org org = orgService.selectOrgByOrgId("100015");
        user.getOrgs().add(org);
        org = orgService.selectOrgByOrgId("100013");
        user.getOrgs().add(org);
        org = orgService.selectOrgByOrgId("100014");
        user.getOrgs().add(org);
        boolean b = userService.insertUser(user);
        System.out.println(b);
    }

    @Test
    public void insertUserRolesTest() {
        String[] ls = {"100014", "100015", "100016", "100017"};
        for (String l : ls) {
            boolean b = userService.insertUserRole("110065", l);
            System.out.println(b);
        }
    }

    @Test
    public void deleteUserTest() {
        String userId = "10005";
        boolean b = userService.deleteUserByUserId(userId);
        System.out.println(b);
    }


    @Test
    public void updateUserTest() {
        User user = new User();
        user.setUserId("100056");
        user.setAccount("admin56");
        user.setPassword("admin56");
        user.setUserName("admin56");
        user.setUserStatus("0");
        boolean b = userService.updateUserByUserId(user);
        System.out.println(b);
    }
    @Test
    public void updateAllUserPasswordTest() {
        List<User> users = userService.selectAllUser();
        for (User user : users) {
            String password = user.getPassword();
            password = new Sha256Hash(password).toHex();
            user.setPassword(password);
            boolean b = userService.updateUserByUserId(user);
            System.out.println(b);
        }
    }

    @Test
    public void selectUserTest() {
        User b = userService.selectUserByUserId("100050");
        System.out.println(b);
    }

}
