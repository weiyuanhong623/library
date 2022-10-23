package com.zhang.librarytest.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.librarytest.domain.Book;
import com.zhang.librarytest.service.impl.BookServiceImpl;
import com.zhang.librarytest.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/book")
@Api(tags = "图书管理")
public class BookController {

    @Autowired
    BookServiceImpl bookService;

    @GetMapping("/list")
    @ApiOperation("列表-查询-分页")
    public Result selectList(Book book, @RequestParam(required = false, defaultValue = "1") Integer pageNum, @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Book> books = bookService.selectList(book);
        HashMap<String, Object> ret = new HashMap<>();
        ret.put("data", books);
        ret.put("total", new PageInfo(books));
        return Result.success(ret);
    }

    @GetMapping("/{id}")
    @ApiOperation("根据id查询")
    public Result selectById(@PathVariable Integer id) {
        return Result.success(bookService.selectById(id));
    }

    @PostMapping
    @ApiOperation("新增")
    public Result add(@RequestBody Book book) {
        return  Result.success(bookService.insert(book));
    }

    @PutMapping
    @ApiOperation("编辑")
    public Result edit(@RequestBody Book book) {
        return Result.success(bookService.updateById(book));
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Integer id) {
        return Result.success(bookService.deleteById(id));
    }


}
