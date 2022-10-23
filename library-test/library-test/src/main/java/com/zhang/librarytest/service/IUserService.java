package com.zhang.librarytest.service;

import com.zhang.librarytest.domain.User;

import java.util.List;

public interface IUserService {

    public List<User> selectList(User user);
    public User selectById(Integer id);
    public int insert(User user);
    public int updateById(User user);
    public int deleteById(Integer id);

}
