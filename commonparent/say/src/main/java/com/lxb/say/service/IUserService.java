package com.lxb.say.service;

import com.lxb.say.po.User;
import com.lxb.say.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

    // 写用户特有的方法
    public User login(String username,String password);
}
