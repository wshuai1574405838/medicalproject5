package com.medical.project.user.controller;


import com.medical.project.common.po.User;
import com.medical.project.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
* 提供者
*
*/

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public List<User> selectAll(){

        List<User> users = userService.selectAll();
        return users;
    }
}
