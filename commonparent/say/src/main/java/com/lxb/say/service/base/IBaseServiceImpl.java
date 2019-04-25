package com.lxb.say.service.base;

import com.lxb.say.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class IBaseServiceImpl<T> implements IBaseService<T> {

    // 统一管理dao
    @Autowired
    protected UserMapper  userMapper;
}
