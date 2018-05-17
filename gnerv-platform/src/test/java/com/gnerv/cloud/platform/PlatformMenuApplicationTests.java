package com.gnerv.cloud.platform;

import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.entity.Org;
import com.gnerv.cloud.platform.service.MenuService;
import com.gnerv.cloud.platform.service.OrgService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlatformMenuApplicationTests {

	@Autowired
    MenuService menuService;

	@Test
	public void contextLoads() {
	}

    @Test
    public void insertMenuTest() {
        Menu menu = new Menu();
        for (int i = 0; i <= 20; i++) {
            menu.setMenuId("30003" + i);
            menu.setMenuName("3级菜单30003" + i);
            menu.setMenuType("0");
            menu.setMenuUrl("/menu" + i);
            menu.setMenuPermission("menu:create" + i);
            menu.setMenuStatus("0");
            menu.setMenuSort(1000);
            boolean b = menuService.insertMenu(menu);
            System.out.println(b);
        }
    }

    @Test
    public void deleteMenuTest() {
        boolean b = menuService.deleteMenuByMenuId("3000315");
        System.out.println(b);
    }

    @Test
    public void updateMenuTest() {
        Menu menu = new Menu();
        int i = 1;
        menu.setMenuId("30003" + i);
        menu.setMenuName("改3级菜单30003" + i);
        menu.setMenuType("1");
        menu.setMenuUrl("改/menu" + i);
        menu.setMenuPermission("改menu:create" + i);
        menu.setMenuStatus("1");
        menu.setMenuSort(1001);
        boolean b = menuService.updateMenuByMenuId(menu);
        System.out.println(b);
    }

    @Test
    public void selectMenuTest() {
        Menu b = menuService.selectMenuByMenuId("300031");
        System.out.println(b);
    }

}
