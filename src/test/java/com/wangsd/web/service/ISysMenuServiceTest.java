package com.wangsd.web.service;

import com.wangsd.base.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Administrator on 2017/12/29.
 */
public class ISysMenuServiceTest extends BaseTest {
    @Autowired
    ISysMenuService menuService;

    @Test
    public void selectMenuCustomByRoleId() throws Exception {
        menuService.selectMenuCustomByRoleId(3);
    }

}