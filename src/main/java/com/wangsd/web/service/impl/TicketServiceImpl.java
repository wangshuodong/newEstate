package com.wangsd.web.service.impl;

import com.wangsd.web.model.Ticket;
import com.wangsd.web.mapper.TicketDao;
import com.wangsd.web.service.ITicketService;
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
public class TicketServiceImpl extends ServiceImpl<TicketDao, Ticket> implements ITicketService {

}
