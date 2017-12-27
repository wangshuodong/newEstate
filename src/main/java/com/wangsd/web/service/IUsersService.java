package com.wangsd.web.service;

import com.wangsd.web.model.Users;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author wangsd
 * @since 2017-12-27
 */
public interface IUsersService extends IService<Users> {
    List<Users> findAll();

}
