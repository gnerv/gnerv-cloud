package com.gnerv.cloud.platform.mapper;

import com.gnerv.cloud.platform.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 平台菜单表 Mapper 接口
 * </p>
 *
 * @author gnerv
 * @since 2018-05-09
 */
@Mapper
public interface MenuMapper {

    int insertMenu(Menu menu);

    int deleteMenuByMenuId(String menuId);

    int updateMenuByMenuId(Menu menu);

    Menu selectMenuByMenuId(String menuId);

    List<Menu> selectAllMenu();
}
