package com.zhang.librarytest.service.impl;

import com.zhang.librarytest.dao.UserDao;
import com.zhang.librarytest.domain.User;
import com.zhang.librarytest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
/*
* 业务层
* */
//放入容器中
public class UserServiceImpl implements IUserService {

    //spring容器
    @Autowired
    private UserDao userDao;

    @Override
    public List<User> selectList(User user) {
        return userDao.selectList(user);
    }

    @Override
    public User selectById(Integer id) {
        return userDao.selectById(id);
    }

    @Override
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public int updateById(User user) {
        return userDao.updateById(user);
    }

    @Override
    public int deleteById(Integer id) {
        return userDao.deleteById(id);
    }
}
