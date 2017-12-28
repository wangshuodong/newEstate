package com.wangsd.web.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.wangsd.web.model.SysMenu;
import com.wangsd.web.modelCustom.MenuCustom;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 * 菜单表 Mapper 接口
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
public interface SysMenuDao extends BaseMapper<SysMenu> {

    /**
     * 查询登录用户左侧菜单树
     * @param roleId
     * @return
     */
    List<MenuCustom> selectMenuCustomByRoleId(@Param("roleId") Integer roleId);
}
