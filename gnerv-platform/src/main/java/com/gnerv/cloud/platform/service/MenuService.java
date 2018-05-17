package com.gnerv.cloud.platform.service;

import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.util.Tree;

import java.util.List;

/**
 * @description: 菜单服务 接口类
 * @author: Gnerv LiGen
 * @date: 2018-05-16
 **/
public interface MenuService {

    boolean insertMenu(Menu menu);

    boolean deleteMenuByMenuId(String menuId);

    boolean updateMenuByMenuId(Menu menu);

    Menu selectMenuByMenuId(String menuId);

    List<Tree<Menu>> selectAllMenu();
}
