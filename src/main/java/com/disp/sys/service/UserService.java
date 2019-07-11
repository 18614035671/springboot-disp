package com.disp.sys.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.disp.sys.entity.UserEntity;

import java.util.List;
import java.util.Map;

/**
 * 用户表
 *
 * @author xuzl
 * @email 18614035671@163.com
 * @date 2019-05-30 20:00:13
 */
public interface UserService extends IService<UserEntity> {

    List<UserEntity> getUser();

    void insertUser();

    void updateUser(Integer id);

    void delAllUser(String[] ids);

    void deleteUser(Integer id);

    IPage<UserEntity> getUserPage(Integer currentPage, Integer pageSize);

}

