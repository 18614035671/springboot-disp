package com.disp.sys.dao;

import com.disp.sys.entity.UserRoleEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Repository;

/**
 * 用户角色关联表
 * 
 * @author xuzl
 * @email 18614035671@163.com
 * @date 2019-05-30 20:00:13
 */
@Repository
public interface UserRoleDao extends BaseMapper<UserRoleEntity> {
	
}
