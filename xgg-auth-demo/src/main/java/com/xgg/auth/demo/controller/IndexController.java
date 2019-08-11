package com.xgg.auth.demo.controller;

import com.xgg.auth.session.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: renchengwei
 * @Date: 2019-08-10
 * @Description: TODO
 */
@RestController
public class IndexController {

    @Autowired
    private SessionService sessionService;

    @RequestMapping("/index")
    public String index() {
       return sessionService.test();
    }
}
