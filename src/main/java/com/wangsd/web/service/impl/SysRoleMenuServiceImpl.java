package com.wangsd.web.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wangsd.web.mapper.SysMenuDao;
import com.wangsd.web.mapper.SysRoleMenuDao;
import com.wangsd.web.model.SysRoleMenu;
import com.wangsd.web.service.ISysRoleMenuService;
import org.apache.commons.lang3.ArrayUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色菜单关联表 服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuDao, SysRoleMenu> implements ISysRoleMenuService {
    @Autowired
    private SysMenuDao sysMenuMapper;

    @Override
    public void addAuth(Integer roleId, Integer[] menuIds) {
        // TODO Auto-generated method stub

        /**
         * 删除原有权限
         */
        this.delete(new EntityWrapper<SysRoleMenu>().eq("roleId",roleId));
        /**
         * 重新授权
         */
        if(ArrayUtils.isNotEmpty(menuIds)){
            for(Integer menuId : menuIds){
                SysRoleMenu sysRoleMenu2 = new SysRoleMenu();
                sysRoleMenu2.setRoleId(roleId);
                sysRoleMenu2.setMenuId(menuId);
                this.insert(sysRoleMenu2);
            }
        }
    }
}
