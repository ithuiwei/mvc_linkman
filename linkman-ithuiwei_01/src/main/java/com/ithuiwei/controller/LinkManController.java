package com.ithuiwei.controller;

import com.ithuiwei.pojo.LinkMan;
import com.ithuiwei.service.LinkManService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/linkman")
public class LinkManController {

    @RequestMapping("/findAll")
   public String findAll(){
        return "findAll";
    }
}
