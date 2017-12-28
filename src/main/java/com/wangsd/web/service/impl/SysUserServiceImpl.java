package com.wangsd.web.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wangsd.web.mapper.SysUserDao;
import com.wangsd.web.model.SysUser;
import com.wangsd.web.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserDao, SysUser> implements ISysUserService {

    @Autowired
    private SysUserDao userDao;

    @Override
    public void insertUser(SysUser user, Integer[] roleIds) {
        // TODO Auto-generated method stub
        user.setCreateTime(new Date());
        //保存用户
        this.insert(user);

    }

    @Override
    public void updateUser(SysUser sysUser, Integer[] roleIds) {
        //更新用户
        this.updateById(sysUser);
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        this.deleteById(id);
    }
}
