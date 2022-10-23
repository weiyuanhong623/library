package com.zhang.librarytest.dao;

import com.zhang.librarytest.domain.User;

import java.util.List;

public interface UserDao {

    public List<User> selectList(User user);
    public User selectById(Integer id);
    public int insert(User user);
    public int updateById(User user);
    public int deleteById(Integer id);

}
