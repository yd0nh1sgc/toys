package com.toys.dao;

import com.toys.bean.Users;

/**
 * Created by Administrator on 2018/1/26.
 */
public interface UsersDao {
    //登录方法
    public Users findUsersByaccountAndPassword(Users users);
    //注册方法
    public void addUser(Users users);
    //修改密码
    public String selectPasswordById(Integer id);
   //修改个人信息
    public void updateUserInfo(Users users);
}
