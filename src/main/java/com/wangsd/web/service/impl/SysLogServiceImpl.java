package com.wangsd.web.service.impl;

import com.wangsd.web.model.SysLog;
import com.wangsd.web.mapper.SysLogDao;
import com.wangsd.web.service.ISysLogService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统日志 服务实现类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-13
 */
@Service
public class SysLogServiceImpl extends ServiceImpl<SysLogDao, SysLog> implements ISysLogService {

}
