package com.ithuiwei.controller;

import com.ithuiwei.entry.Result;
import com.ithuiwei.pojo.LinkMan;
import com.ithuiwei.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/linkman")
public class LinkManController {
    @Autowired
    private LinkManService linkManService;
    @RequestMapping("/findAll")
    public Result findAll(){

        try {
            List<LinkMan> linkmanList = linkManService.findAll();
            return new Result(true,"查找成功",linkmanList);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"查找失败");
        }

    }
}
