package com.wangsd.web.service.impl;

import com.wangsd.web.model.Role;
import com.wangsd.web.mapper.RoleDao;
import com.wangsd.web.service.IRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleDao, Role> implements IRoleService {
	
}
