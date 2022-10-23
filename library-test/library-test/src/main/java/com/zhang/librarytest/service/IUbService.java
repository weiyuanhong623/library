package com.zhang.librarytest.service;

import com.zhang.librarytest.domain.Ub;

import java.util.List;

public interface IUbService {

    public List<Ub> selectList(Ub ub);
    public Ub selectById(Integer id);
    public int insert(Ub ub);
    public int updateById(Ub ub);
    public int deleteById(Integer id);


}
