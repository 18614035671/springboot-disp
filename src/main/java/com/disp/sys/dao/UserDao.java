package com.disp.sys.dao;

import com.disp.sys.entity.UserEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.jfunc.json.impl.JSONObject;

/**
 * 用户表
 * 
 * @author xuzl
 * @email 18614035671@163.com
 * @date 2019-05-30 20:00:13
 */
@Repository
public interface UserDao extends BaseMapper<UserEntity> {

    void insertSignatureRecord(JSONObject params);
}
