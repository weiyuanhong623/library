package com.zhang.librarytest.service;

import com.zhang.librarytest.domain.Book;

import java.util.List;

public interface IBookService {
    public List<Book> selectList(Book book);
    public Book selectById(Integer id);
    public int insert(Book book);
    public int updateById(Book book);
    public int deleteById(Integer id);

}
