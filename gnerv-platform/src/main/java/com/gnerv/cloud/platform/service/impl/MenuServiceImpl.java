package com.gnerv.cloud.platform.service.impl;

import com.gnerv.cloud.platform.entity.Menu;
import com.gnerv.cloud.platform.mapper.MenuMapper;
import com.gnerv.cloud.platform.service.MenuService;
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
        List<Tree<Menu>> trees = new ArrayList<>();
        List<Menu> menus = menuMapper.selectAllMenu();
        for (Menu menu : menus) {
            Tree<Menu> tree = new Tree<>();
            tree.setId(menu.getMenuId().toString());
            tree.setParentId(menu.getpId());
            tree.setText(menu.getMenuName());
            Map<String, Object> attributes = new HashMap<>(32);
            attributes.put("menuUrl", menu.getMenuUrl());
            attributes.put("menuPermission", menu.getMenuPermission());
            tree.setAttributes(attributes);
            trees.add(tree);
        }
        // 默认顶级菜单为０，根据数据库实际情况调整
        List<Tree<Menu>> list = BuildTree.buildList(trees, "0");
        return list;
    }
}
