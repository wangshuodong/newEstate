package com.wangsd.web.service;

import com.wangsd.web.model.SysRoleMenu;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 角色菜单关联表 服务类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
public interface ISysRoleMenuService extends IService<SysRoleMenu> {
    /**
     * 角色授权
     */
    void addAuth(Integer roleId, Integer[] menuIds);
}
