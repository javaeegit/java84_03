package com.itheima.service.Impl;

import com.itheima.dao.Impl.IUserDao;
import com.itheima.dao.UserDao;
import com.itheima.entiry.User;
import com.itheima.service.UserService;

public class IUserService implements UserService {

    private UserDao userDao;

    public void save(User user) {
        userDao.save(user);
    }

    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }


}
