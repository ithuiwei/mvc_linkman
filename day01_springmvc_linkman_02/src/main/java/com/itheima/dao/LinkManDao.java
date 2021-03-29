package com.itheima.dao;

import com.itheima.pojo.LinkMan;

import java.util.List;

/**
 * 包名:com.itheima.dao
 *
 * @author Leevi
 * 日期2020-08-13  16:07
 */
public interface LinkManDao {
    List<LinkMan> findAll();

    void add(LinkMan linkMan);
}
