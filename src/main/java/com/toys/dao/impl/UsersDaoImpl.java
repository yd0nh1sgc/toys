package com.toys.dao.impl;

import com.toys.bean.Users;
import com.toys.dao.UsersDao;

/**
 * Created by Administrator on 2018/1/26.
 */
//@Repository("userDao")
public class UsersDaoImpl implements UsersDao {
    //@Autowired
    //private SqlSessionTemplate sqlSessionTemplate;
    public Users findUsersByaccountAndPassword(Users users) {
       // return return sqlSessionTemplate.selectOne("com.j38.day2.userMapper.getUserById", uid);
        return null;
    }

    public void addUser(Users users) {

    }

    public String selectPasswordById(Integer id) {
        return null;
    }

    public void updateUserInfo(Users users) {

    }
   /* @Autowired
    private SqlSessionTemplate sqlSessionTemplate;*/


}
