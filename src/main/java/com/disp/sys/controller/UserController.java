package com.disp.sys.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.disp.common.utils.R;
import com.disp.sys.entity.UserEntity;
import com.disp.sys.service.UserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.Arrays;
import java.util.List;



/**
 * 用户表
 *
 * @author xuzl
 * @email 18614035671@163.com
 * @date 2019-05-30 20:00:13
 */
@RestController
@RequestMapping("sys/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value="获取用户", notes="获取用户详细信息")
    @GetMapping(value = "getUser" )
    public R getUser(){
        List<UserEntity> list = userService.getUser();
        return R.ok(list);
    }

    @ApiOperation(value="获取用户分页", notes="获取用户详细信息分页")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "currentPage", value = "页数", required = true, dataType = "Integer",paramType = "path"),
            @ApiImplicitParam(name = "pageSize", value = "条数", required = true, dataType = "Integer",paramType = "path")
    })
   @GetMapping(value = "getUserPage" )
    public R getUserPage(Integer currentPage,Integer pageSize){
       IPage<UserEntity> list = userService.getUserPage(currentPage,pageSize);
        return R.ok(list);
    }

    @ApiOperation(value="添加", notes="添加用户详细信息")
    @PostMapping(value = "insertUser" )
    public R insertUser(){
        try {
            userService.insertUser();
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error(Arrays.toString(e.getStackTrace()));
        }

    }

    @ApiOperation(value="修改", notes="修改用户详细信息")
    @ApiImplicitParam(name = "id", value = "用户ID", required = true, dataType = "Integer", paramType = "path")
    @PostMapping(value = "updateUser")
    public R updateUser(Integer id){
        try {
            userService.updateUser(id);
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error(Arrays.toString(e.getStackTrace()));
        }
    }
    @PostMapping(value = "deleteUser" )
    public R deleteUser(Integer id){
        try {
            userService.deleteUser(id);
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error(Arrays.toString(e.getStackTrace()));
        }
    }

    //@ApiIgnore//使用该注解忽略这个API
    @PostMapping(value = "doSuccessProcess" )
    public R doSuccessProcess(){
        try {
            userService.doSuccessProcess();
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error(Arrays.toString(e.getStackTrace()));
        }
    }


}
