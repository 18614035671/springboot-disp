package com.disp.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.disp.sys.dao.RoleDao;
import com.disp.sys.entity.RoleEntity;
import com.disp.sys.service.RoleService;


@Service("roleService")
public class RoleServiceImpl extends ServiceImpl<RoleDao, RoleEntity> implements RoleService {
    @Autowired
    private RoleDao roleDao;
}
