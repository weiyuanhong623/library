package com.zhang.librarytest.service.impl;

import com.zhang.librarytest.dao.UbDao;
import com.zhang.librarytest.domain.Ub;
import com.zhang.librarytest.service.IUbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UbServiceImpl implements IUbService {

    @Autowired
    private UbDao ubDao;

    @Override
    public List<Ub> selectList(Ub ub) {
        return ubDao.selectList(ub);
    }

    @Override
    public Ub selectById(Integer id) {
        return ubDao.selectById(id);
    }

    @Override
    public int insert(Ub ub) {
        return ubDao.insert(ub);
    }

    @Override
    public int updateById(Ub ub) {
        return ubDao.updateById(ub);
    }

    @Override
    public int deleteById(Integer id) {
        return ubDao.deleteById(id);
    }
}
