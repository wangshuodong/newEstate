package com.wangsd.web.service;

import com.baomidou.mybatisplus.service.IService;
import com.wangsd.web.model.Menu;
import com.wangsd.web.modelCustom.TreeMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
public interface IMenuService extends IService<Menu> {
    /**
     * 获取当前用户的菜单
     */
    List<TreeMenu> selectTreeMenuByUserId(Integer uid);
}
