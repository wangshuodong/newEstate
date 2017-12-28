package com.wangsd.web;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.wangsd.base.BaseTest;
import com.wangsd.commons.shiro.PasswordHash;
import com.wangsd.commons.util.StringUtils;
import com.wangsd.web.model.SysMenu;
import com.wangsd.web.model.SysRole;
import com.wangsd.web.model.SysUser;
import com.wangsd.web.service.ISysMenuService;
import com.wangsd.web.service.ISysRoleMenuService;
import com.wangsd.web.service.ISysRoleService;
import com.wangsd.web.service.ISysUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

public class TestAdmin extends BaseTest {
	
	@Autowired
    private ISysRoleService sysRoleService;
	@Autowired
    private ISysRoleMenuService sysRoleMenuService;
	@Autowired
    private ISysMenuService sysMenuService;
	@Autowired
    private ISysUserService sysUserService;
	@Autowired
	private PasswordHash passwordHash;
	
	/**
	 * 创建一个Admin用户
	 */
	@Test
	public void addAdmin() {
		
		//创建角色
		SysRole sysRole = new SysRole();
		sysRole.setRoleName("超级管理员");
		sysRole.setRoleState(1);
		sysRole.setCreateTime(new Date());
		sysRoleService.insert(sysRole);
		//查询权限
		List<Object> list = sysMenuService.selectObjs(new EntityWrapper<SysMenu>().setSqlSelect("id"));
		//分配权限
		sysRoleMenuService.addAuth(sysRole.getId(),list.toArray(new Integer[list.size()]));
		//添加用户
		SysUser user = new SysUser();
		user.setUserState(1);
		user.setUserName("admin");
		String salt = StringUtils.getUUId();
		String pwd = passwordHash.toHex("123456", salt);
		user.setSalt(salt);
		user.setPassword(pwd);
		user.setPwd("123456");
		user.setCreateTime(new Date());
		sysUserService.insertUser(user, new Integer[]{sysRole.getId()});
		
	}

}
