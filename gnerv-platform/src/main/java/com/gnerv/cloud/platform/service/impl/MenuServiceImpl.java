package com.gnerv.cloud.platform.service.impl;

import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.mapper.MenuMapper;
import com.gnerv.cloud.platform.service.MenuService;
import com.gnerv.cloud.platform.util.BuildMenuTree;
import com.gnerv.cloud.platform.util.BuildTree;
import com.gnerv.cloud.platform.util.Tree;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 菜单服务 实现类
 * @author: Gnerv LiGen
 * @date: 2018-05-17
 **/
@Service
public class MenuServiceImpl implements MenuService {

    @Autowired
    MenuMapper menuMapper;

    @Override
    public boolean insertMenu(Menu menu) {
        int i = menuMapper.insertMenu(menu);
        return i == 1 ? true : false;
    }

    @Override
    public boolean deleteMenuByMenuId(String menuId) {
        int i = menuMapper.deleteMenuByMenuId(menuId);
        return i == 1 ? true : false;
    }

    @Override
    public boolean updateMenuByMenuId(Menu menu) {
        int i = menuMapper.updateMenuByMenuId(menu);
        return i == 1 ? true : false;
    }

    @Override
    public Menu selectMenuByMenuId(String menuId) {
        Menu menu = menuMapper.selectMenuByMenuId(menuId);
        return menu;
    }

    @Override
    public List<Tree<Menu>> selectAllMenu() {
        List<Menu> menus = menuMapper.selectAllMenu();
        return BuildMenuTree.getMenuTree(menus, "0");
    }
}
