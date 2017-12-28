package com.wangsd.web.controller;


import com.wangsd.commons.base.BaseController;
import com.wangsd.web.model.SysUser;
import com.wangsd.web.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
@Controller
@RequestMapping("/sysUser")
public class SysUserController extends BaseController {

    @Autowired
    ISysUserService iSysUserService;

    @RequestMapping("/list")
    public void list() {
        List<SysUser> list = iSysUserService.selectList(null);
        System.out.println("----------");
    }

}

