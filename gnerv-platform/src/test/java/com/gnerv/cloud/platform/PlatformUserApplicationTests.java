package com.gnerv.cloud.platform;

import com.gnerv.cloud.platform.entity.User;
import com.gnerv.cloud.platform.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformUserApplicationTests {

	@Autowired
    UserService userService;

	@Test
	public void contextLoads() {
	}

    @Test
    public void insertUserTest() {
        User user = new User();
        for (int i = 0; i <= 10; i++) {
            user.setUserId("10005" + i);
            user.setAccount("user2" + i);
            user.setPassword("user2" + i);
            user.setUserName("user2" + i);
            user.setUserStatus("0");
            boolean b = userService.insertUser(user);
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
    public void selectUserTest() {
        User b = userService.selectUserByUserId("100050");
        System.out.println(b);
    }

}
