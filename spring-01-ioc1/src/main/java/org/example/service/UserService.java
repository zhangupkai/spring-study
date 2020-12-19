package org.example.service;

import org.example.dao.UserDao;

/**
 * @Description
 * @Author Kai
 * @Date 2020/12/18 16:41
 */
public interface UserService {

    void getUser();

    void setUserDao(UserDao userDao);
}
