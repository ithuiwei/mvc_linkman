package com.itheima.service;

import com.itheima.pojo.LinkMan;

import java.util.List;

/**
 * 包名:com.itheima.service
 *
 * @author Leevi
 * 日期2020-08-13  16:07
 */
public interface LinkManService {
    List<LinkMan> findAll();

    void add(LinkMan linkMan);
}
