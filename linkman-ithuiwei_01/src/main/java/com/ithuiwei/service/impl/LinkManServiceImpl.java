package com.ithuiwei.service.impl;

import com.ithuiwei.dao.LinkManDao;
import com.ithuiwei.pojo.LinkMan;
import com.ithuiwei.pojo.User;
import com.ithuiwei.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LinkManServiceImpl implements LinkManService {
    @Autowired
    private LinkManDao linkManDao;
    @Override
    public List<User> findAll() {
        return linkManDao.findAll();
    }
}
