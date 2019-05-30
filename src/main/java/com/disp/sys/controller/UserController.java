package com.disp.sys.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.disp.sys.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disp.sys.service.UserService;
import com.disp.common.utils.R;



/**
 * 用户表
 *
 * @author xuzl
 * @email xzl18614035671@gmail.com
 * @date 2019-05-30 20:00:13
 */
@RestController
@RequestMapping("sys/user")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping(value = "getUser" )
    public R getUser(){
        List<UserEntity> list = userService.getUser();
        return R.ok(list);
    }

    @GetMapping(value = "getUserPage" )
    public R getUserPage(Integer currentPage,Integer pageSize){
        IPage<UserEntity> list = userService.getUserPage(currentPage,pageSize);
        return R.ok(list);
    }

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

    @PostMapping(value = "delAllUser" )
    public R delAllUser(String[] ids){
        try {
            userService.delAllUser(ids);
            return R.ok();
        }catch (Exception e){
            e.printStackTrace();
            return R.error(Arrays.toString(e.getStackTrace()));
        }

    }
}
