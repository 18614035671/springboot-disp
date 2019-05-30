package com.disp.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disp.sys.entity.RoleMenuEntity;
import com.disp.sys.service.RoleMenuService;
import com.disp.common.utils.R;



/**
 * 角色菜单关联表
 *
 * @author xuzl
 * @email xzl18614035671@gmail.com
 * @date 2019-05-30 20:00:13
 */
@RestController
@RequestMapping("sys/rolemenu")
public class RoleMenuController {
    @Autowired
    private RoleMenuService roleMenuService;

}
