package com.disp.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.disp.sys.dao.RoleMenuDao;
import com.disp.sys.entity.RoleMenuEntity;
import com.disp.sys.service.RoleMenuService;


@Service("roleMenuService")
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuDao, RoleMenuEntity> implements RoleMenuService {
    @Autowired
    private RoleMenuDao roleMenuDao;
}
