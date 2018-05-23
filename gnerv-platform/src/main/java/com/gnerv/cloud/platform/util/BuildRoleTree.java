package com.gnerv.cloud.platform.util;

import com.gnerv.cloud.platform.entity.Role;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @description: 构建角色树
 * @author: Gnerv LiGen
 * @date: 2018-05-23
 **/
public class BuildRoleTree {

    public static List<Tree<Role>> getRoleTree(List<Role> roles, String pId) {
        List<Tree<Role>> trees = new ArrayList<>();
        for (Role role : roles) {
            Tree<Role> tree = new Tree<>();
            tree.setId(role.getRoleId().toString());
            tree.setParentId(role.getpId());
            tree.setText(role.getRoleName());
            Map<String, Object> attributes = new HashMap<>(8);
            attributes.put("roleNotes", role.getRoleNotes());
            attributes.put("roleStatus", role.getRoleStatus());
            tree.setAttributes(attributes);
            trees.add(tree);
        }
        List<Tree<Role>> list = BuildTree.buildList(trees, "0");
        return list;
    }

}
