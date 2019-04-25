package com.lxb.say.mapper;


import com.lxb.say.mapper.base.BaseMapper;
import com.lxb.say.po.User;

public interface UserMapper extends BaseMapper<User> {

        public User selectUserById(String id);
}
