package com.itheima.controller;
import com.itheima.entry.Result;
import com.itheima.pojo.LinkMan;
import com.itheima.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * 包名:com.itheima.controller
 * @author Leevi
 * 日期2020-08-13  16:09
 */
@RestController
@RequestMapping("/linkman")
public class LinkManController {
    @Autowired
    private LinkManService linkManService;
    @RequestMapping("/findAll")
    public Result findAll(){
        List<LinkMan> linkManList = linkManService.findAll();
        return new Result(true,"查询成功",linkManList);
    }

    @PostMapping("/add")
    public Result addLinkMan(@RequestBody LinkMan linkMan){
        try {
            //调用业务层的方法，添加联系人
            linkManService.add(linkMan);
            return new Result(true,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"添加失败");
        }
    }
}
