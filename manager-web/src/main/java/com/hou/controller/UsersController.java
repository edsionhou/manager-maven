package com.hou.controller;

import com.hou.pojo.Users;
import com.hou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: edison
 * @Date: 2020/1/31 12时06分
 * @Description:
 */
@Controller
@RequestMapping(value = {"/user"})
public class UsersController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/addUser"})
    public String addUser(Users users) {
        System.out.println(users);
        userService.addUser(users);
        return "OK";
    }
}
