package com.wangsd.web.service;

import com.baomidou.mybatisplus.service.IService;
import com.wangsd.core.entity.PageInfo;
import com.wangsd.web.model.SysLog;

/**
 *
 * SysLog 表数据服务层接口
 *
 */
public interface SysLogService extends IService<SysLog> {

    void selectDataGrid(PageInfo pageInfo);

}