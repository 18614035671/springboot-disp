package com.disp.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.disp.sys.dao.UserRoleDao;
import com.disp.sys.entity.UserRoleEntity;
import com.disp.sys.service.UserRoleService;


@Service("userRoleService")
public class UserRoleServiceImpl extends ServiceImpl<UserRoleDao, UserRoleEntity> implements UserRoleService {
    @Autowired
    private UserRoleDao userRoleDao;
}
