package com.disp.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disp.sys.entity.LogEntity;
import com.disp.sys.service.LogService;
import com.disp.common.utils.R;



/**
 * 操作日志表
 *
 * @author xuzl
 * @email xzl18614035671@gmail.com
 * @date 2019-05-30 20:00:13
 */
@RestController
@RequestMapping("sys/log")
public class LogController {
    @Autowired
    private LogService logService;

}
