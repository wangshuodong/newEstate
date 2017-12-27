package com.wangsd.web.service.impl;

import com.wangsd.web.model.Users;
import com.wangsd.web.mapper.UsersDao;
import com.wangsd.web.service.IUsersService;
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
public class UsersServiceImpl extends ServiceImpl<UsersDao, Users> implements IUsersService {

}
