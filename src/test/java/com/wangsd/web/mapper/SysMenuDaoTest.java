package com.wangsd.web.mapper;

import com.wangsd.base.BaseTest;
import com.wangsd.web.modelCustom.MenuCustom;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2017/12/31.
 */
public class SysMenuDaoTest extends BaseTest {

    @Autowired
    SysMenuDao sysMenuDao;

    @Test
    public void selectMenuCustomByRoleId() throws Exception {
        List<MenuCustom> list = sysMenuDao.selectMenuCustomByRoleId(3);
        System.out.println(list.size());
    }

}