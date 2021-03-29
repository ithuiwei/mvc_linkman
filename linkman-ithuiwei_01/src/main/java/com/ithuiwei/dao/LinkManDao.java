package com.ithuiwei.dao;

import com.ithuiwei.pojo.LinkMan;
import com.ithuiwei.pojo.User;

import java.util.List;

public interface LinkManDao {
    List<User> findAll();
}
