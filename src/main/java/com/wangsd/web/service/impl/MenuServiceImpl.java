package com.wangsd.web.service.impl;

import com.wangsd.web.model.Menu;
import com.wangsd.web.mapper.MenuDao;
import com.wangsd.web.service.IMenuService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-13
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuDao, Menu> implements IMenuService {

}
