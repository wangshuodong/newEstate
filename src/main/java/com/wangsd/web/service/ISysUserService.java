package com.wangsd.web.service;

import com.wangsd.web.model.SysUser;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
public interface ISysUserService extends IService<SysUser> {

    /**
     * 保存用户
     */
    void insertUser(SysUser user, Integer[] roleId);
    /**
     * 更新用户
     */
    void updateUser(SysUser sysUser, Integer[] roleId);
    /**
     * 删除用户
     */
    void delete(Integer id);
}
