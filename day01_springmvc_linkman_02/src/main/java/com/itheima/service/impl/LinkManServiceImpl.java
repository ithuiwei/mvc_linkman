package com.itheima.service.impl;

import com.itheima.dao.LinkManDao;
import com.itheima.pojo.LinkMan;
import com.itheima.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 包名:com.itheima.service.impl
 *
 * @author Leevi
 * 日期2020-08-13  16:07
 */
@Service
public class LinkManServiceImpl implements LinkManService {
    @Autowired
    private LinkManDao linkManDao;
    @Override
    public List<LinkMan> findAll() {
        return linkManDao.findAll();
    }

    @Override
    public void add(LinkMan linkMan) {
        linkManDao.add(linkMan);
    }
}
