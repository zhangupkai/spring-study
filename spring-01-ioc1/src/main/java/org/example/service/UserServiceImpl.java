package org.example.service;

import org.example.dao.UserDao;
import org.example.dao.UserDaoImpl;
import org.example.dao.UserDaoMysqlImpl;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/18 16:42
 */
public class UserServiceImpl implements UserService{

    private UserDao userDao;

    // 动态注入Dao
    @Override
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
