package com.lxb.say.service;

import com.lxb.say.po.User;
import com.lxb.say.service.base.IBaseService;
import com.lxb.say.service.base.IBaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl extends IBaseServiceImpl<User> implements IUserService{
    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User selectUserById(String id) {

        return userMapper.selectUserById(id);
    }

    @Override
    public User selectUserByUUId(String id) {
        return null;
    }

    @Override
    public void insertUserById(Integer id) {

    }

    @Override
    public void insertUserByUUId(String id) {

    }

    @Override
    public void deleteUserById(User user) {

    }

    @Override
    public void updateUserById(User user) {

    }
}
