package com.lxb.say.controller;

import com.lxb.say.po.User;
import com.lxb.say.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private IUserService userService;
    @RequestMapping("login")
    public String login(){
        System.out.println(".....");
        return "login";
    }

    @RequestMapping("selectUserById")
    public String selectUserById(String id){
        User user = userService.selectUserById(id);
        System.out.println(user);
        return null;
    }

}
