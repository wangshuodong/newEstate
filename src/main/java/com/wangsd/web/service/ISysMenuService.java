package com.wangsd.web.service;

import com.baomidou.mybatisplus.service.IService;
import com.wangsd.web.model.SysMenu;
import com.wangsd.web.modelCustom.MenuCustom;

import java.util.List;

/**
 * <p>
 * 菜单表 服务类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
public interface ISysMenuService extends IService<SysMenu> {

    /**
     * 查询登录用户左侧菜单树
     * @param roleId
     * @return
     */
    public List<MenuCustom> selectMenuCustomByRoleId(Integer roleId);
}
