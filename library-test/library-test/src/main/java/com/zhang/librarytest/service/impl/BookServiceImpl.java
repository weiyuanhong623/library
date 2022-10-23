package com.zhang.librarytest.service.impl;

import com.zhang.librarytest.dao.BookDao;
import com.zhang.librarytest.domain.Book;
import com.zhang.librarytest.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> selectList(Book book) {
        return bookDao.selectList(book);
    }

    @Override
    public Book selectById(Integer id) {
        return bookDao.selectById(id);
    }

    @Override
    public int insert(Book book) {
        return bookDao.insert(book);
    }

    @Override
    public int updateById(Book book) {
        return bookDao.updateById(book);
    }

    @Override
    public int deleteById(Integer id) {
        return bookDao.deleteById(id);
    }
}
