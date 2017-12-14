package com.wangsd.web.service.impl;

import com.wangsd.web.model.Permission;
import com.wangsd.web.mapper.PermissionDao;
import com.wangsd.web.service.IPermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-14
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionDao, Permission> implements IPermissionService {
	
}
