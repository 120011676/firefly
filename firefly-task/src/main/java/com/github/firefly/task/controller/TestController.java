package com.github.firefly.task.controller;

import com.github.firefly.task.dao.UserDao;
import com.github.firefly.task.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by say on 8/10/16.
 */
@RestController
public class TestController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public String test() {
        this.userDao.findAll().forEach(user -> System.out.println(user.getId()));
       this.testService.get();
        return "Hello";
    }
}
