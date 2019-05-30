package com.disp.sys.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.disp.sys.dao.LogDao;
import com.disp.sys.entity.LogEntity;
import com.disp.sys.service.LogService;


@Service("logService")
public class LogServiceImpl extends ServiceImpl<LogDao, LogEntity> implements LogService {
    @Autowired
    private LogDao logDao;
}
