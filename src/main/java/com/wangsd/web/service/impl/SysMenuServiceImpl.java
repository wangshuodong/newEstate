package com.wangsd.web.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wangsd.web.mapper.SysMenuDao;
import com.wangsd.web.model.SysMenu;
import com.wangsd.web.modelCustom.MenuCustom;
import com.wangsd.web.service.ISysMenuService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 菜单表 服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuDao, SysMenu> implements ISysMenuService {
    private static final Logger logger = LogManager.getLogger(SysMenuServiceImpl.class.getName());

    @Autowired
    SysMenuDao sysMenuDao;

    /**
     * 查询登录用户左侧菜单树
     * @param roleId
     * @return
     */
    @Override
    public List<MenuCustom> selectMenuCustomByRoleId(Integer roleId){
        logger.debug("wangshuodong");
        logger.error("error");
        List<MenuCustom> list = sysMenuDao.selectMenuCustomByRoleId(roleId);
        return list;
    }
}
