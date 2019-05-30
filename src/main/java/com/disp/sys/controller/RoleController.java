package com.disp.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disp.sys.entity.RoleEntity;
import com.disp.sys.service.RoleService;
import com.disp.common.utils.R;



/**
 * 角色表
 *
 * @author xuzl
 * @email xzl18614035671@gmail.com
 * @date 2019-05-30 20:00:13
 */
@RestController
@RequestMapping("sys/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

}
