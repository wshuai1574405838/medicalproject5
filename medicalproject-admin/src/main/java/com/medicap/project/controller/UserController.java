package com.medicap.project.controller;



import com.medical.project.common.po.User;
import com.medical.project.user.api.UserApi;
import com.medical.project.user.fallback.UserApiError;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserApi userApi;

    @RequestMapping(value = "/select",method = RequestMethod.GET)
    public List<User> selectAll(){
        List<User> users = userApi.selectAll();
        return users;
    }
}
