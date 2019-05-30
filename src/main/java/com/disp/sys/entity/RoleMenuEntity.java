package com.disp.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 角色菜单关联表
 * 
 * @author xuzl
 * @email xzl18614035671@gmail.com
 * @date 2019-05-30 20:00:13
 */
@Data
@TableName("tb_role_menu")
public class RoleMenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 角色ID
	 */
	@TableId
	private Integer roleId;
	/**
	 * 菜单/按钮ID
	 */
	private Integer menuId;

}
