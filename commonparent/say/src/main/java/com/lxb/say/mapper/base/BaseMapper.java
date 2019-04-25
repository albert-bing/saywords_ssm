package com.lxb.say.mapper.base;

import com.lxb.say.po.User;

public interface BaseMapper<T> {
    /*根据id查找用户*/
    public T selectUserById(String id);
    public T selectUserByUUId(String id);
    /*通过id插入用户*/
    public void insertUserById(Integer id);
    public void insertUserByUUId(String id);
    /*通过id删除用户*/
    public void deleteUserById(T user);
    /*通过id修改用户*/
    public void updateUserById(T user);
}
