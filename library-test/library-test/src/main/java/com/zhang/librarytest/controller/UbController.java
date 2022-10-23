package com.zhang.librarytest.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.librarytest.domain.Ub;
import com.zhang.librarytest.service.IUbService;
import com.zhang.librarytest.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/ub")
@Api(tags = "借阅管理")
public class UbController {

    @Autowired
    IUbService ubService;

    @GetMapping("/list")
    @ApiOperation("列表-查询-分页")
    //设置了默认值，@RequestParam
    public Result selectList(Ub ub, @RequestParam(required = false, defaultValue = "1") Integer pageNum, @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Ub> ubs = ubService.selectList(ub);
        HashMap<String, Object> ret = new HashMap<>();
        ret.put("data", ubs);
        ret.put("total",  new PageInfo(ubs));
        return  Result.success(ret);

    }


    //根据id查询  @PathVariable 路径参数
    @GetMapping("/{id}")
    @ApiOperation("根据id查询")
    public Result selectById( @PathVariable Integer id) {
        return Result.success(ubService.selectById(id)) ;
    }


    // 新增
    @PostMapping
    @ApiOperation("新增")
    public Result add(@RequestBody Ub ub){
        return  Result.success(ubService.insert(ub));
    }

    // 编辑
    @PutMapping
    @ApiOperation("编辑")
    public Result edit(@RequestBody Ub ub){
        return Result.success(ubService.updateById(ub)) ;
    }


    // 删除
    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Integer id){
        return Result.success(ubService.deleteById(id)) ;
    }
}
