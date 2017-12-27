package com.wangsd.web.service.impl;

import com.wangsd.web.model.Department;
import com.wangsd.web.mapper.DepartmentDao;
import com.wangsd.web.service.IDepartmentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentDao, Department> implements IDepartmentService {

}
