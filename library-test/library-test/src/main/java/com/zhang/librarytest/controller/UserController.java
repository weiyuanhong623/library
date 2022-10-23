package com.zhang.librarytest.controller;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhang.librarytest.dao.UserDao;
import com.zhang.librarytest.domain.User;
import com.zhang.librarytest.service.IUserService;
import com.zhang.librarytest.utils.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "人员管理")
public class UserController {

    //@Autowired自动去创建一个对象，必须放在@RestController，@RequestMapping，@Service，@Configuration，@Component注解下使用，相当于放入容器
    @Autowired
    IUserService userService;//UserServiceImpl中放入容器，这里取出

    // 查询列表
    @GetMapping("/list")
    @ApiOperation("列表-查询-分页")
    //设置了默认值，@RequestParam
    public Result selectList(User user, @RequestParam(required = false, defaultValue = "1") Integer pageNum, @RequestParam(required = false, defaultValue = "10") Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<User> users = userService.selectList(user);
        HashMap<String, Object> ret = new HashMap<>();
        ret.put("data", users);
        ret.put("total",  new PageInfo(users));
        return  Result.success(ret);

    }


    //根据id查询  @PathVariable 路径参数
    @GetMapping("/{id}")
    @ApiOperation("根据id查询")
    public Result selectById( @PathVariable Integer id) {
        return Result.success(userService.selectById(id)) ;
    }


    // 新增
    @PostMapping
    @ApiOperation("新增")
    public Result add(@RequestBody User user){
        return  Result.success(userService.insert(user));
    }

    // 编辑
    @PutMapping
    @ApiOperation("编辑")
    public Result edit(@RequestBody User user){
        return Result.success(userService.updateById(user)) ;
    }


    // 删除
    @DeleteMapping("/{id}")
    @ApiOperation("删除")
    public Result del(@PathVariable Integer id){
        return Result.success(userService.deleteById(id)) ;
    }

}
