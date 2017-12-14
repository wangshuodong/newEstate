package com.wangsd.web.service.impl;

import com.wangsd.web.model.RolePermission;
import com.wangsd.web.mapper.RolePermissionDao;
import com.wangsd.web.service.IRolePermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色与权限关联表 服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-14
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionDao, RolePermission> implements IRolePermissionService {
	
}
