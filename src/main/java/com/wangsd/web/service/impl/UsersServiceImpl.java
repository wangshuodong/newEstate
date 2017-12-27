package com.wangsd.web.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.wangsd.web.mapper.UsersDao;
import com.wangsd.web.model.Users;
import com.wangsd.web.service.IUsersService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Cacheable(value = "settingCache")
    @Override
    public List<Users> findAll() {
        // TODO Auto-generated method stub
        return this.selectList(new EntityWrapper<Users>().orderBy("sort",true));
    }
}
