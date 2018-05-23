package com.gnerv.cloud.platform.util;

import com.gnerv.cloud.platform.entity.Menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 构建菜单树
 * @author: Gnerv LiGen
 * @date: 2018-05-23
 **/
public class BuildMenuTree {

    public static List<Tree<Menu>> getMenuTree(List<Menu> menus, String pId) {
        List<Tree<Menu>> trees = new ArrayList<>();
        for (Menu menu : menus) {
            Tree<Menu> tree = new Tree<>();
            tree.setId(menu.getMenuId().toString());
            tree.setParentId(menu.getpId());
            tree.setText(menu.getMenuName());
            Map<String, Object> attributes = new HashMap<>(8);
            attributes.put("menuUrl", menu.getMenuUrl());
            attributes.put("menuPermission", menu.getMenuPermission());
            tree.setAttributes(attributes);
            trees.add(tree);
        }
        List<Tree<Menu>> list = BuildTree.buildList(trees, pId);
        return list;
    }

}
