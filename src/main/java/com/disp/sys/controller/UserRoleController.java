package com.disp.sys.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.disp.sys.entity.UserRoleEntity;
import com.disp.sys.service.UserRoleService;
import com.disp.common.utils.R;



/**
 * 用户角色关联表
 *
 * @author xuzl
 * @email 18614035671@163.com
 * @date 2019-05-30 20:00:13
 */
@RestController
@RequestMapping("sys/userrole")
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

}
