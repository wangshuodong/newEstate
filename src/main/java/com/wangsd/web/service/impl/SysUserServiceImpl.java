package com.wangsd.web.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wangsd.web.mapper.SysUserDao;
import com.wangsd.web.mapper.SysUserRoleDao;
import com.wangsd.web.model.SysUser;
import com.wangsd.web.model.SysUserRole;
import com.wangsd.web.service.ISysUserService;
import org.apache.commons.lang3.ArrayUtils;
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
    private SysUserDao userMapper;

    @Autowired private SysUserRoleDao userRoleMapper;

    @Override
    public void insertUser(SysUser user, Integer[] roleIds) {
        // TODO Auto-generated method stub
        user.setCreateTime(new Date());
        //保存用户
        userMapper.insert(user);
        //绑定角色
        if(ArrayUtils.isNotEmpty(roleIds)){
            for(Integer rid : roleIds){
                SysUserRole sysUserRole = new SysUserRole();
                sysUserRole.setUserId(user.getId());
                sysUserRole.setRoleId(rid);
                userRoleMapper.insert(sysUserRole);
            }
        }

    }

    @Override
    public void updateUser(SysUser sysUser, Integer[] roleIds) {
        // TODO Auto-generated method stub
        sysUser.setPassword(null);
        //更新用户
        userMapper.updateById(sysUser);
        //删除已有权限
        userRoleMapper.delete(new EntityWrapper<SysUserRole>().eq("userId",sysUser.getId()));
        //重新绑定角色
        if(ArrayUtils.isNotEmpty(roleIds)){
            for(Integer rid : roleIds){
                SysUserRole sysUserRole = new SysUserRole();
                sysUserRole.setUserId(sysUser.getId());
                sysUserRole.setRoleId(rid);
                userRoleMapper.insert(sysUserRole);
            }
        }
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        this.deleteById(id);
        userRoleMapper.delete(new EntityWrapper<SysUserRole>().addFilter("userId = {0}", id));
    }
}
