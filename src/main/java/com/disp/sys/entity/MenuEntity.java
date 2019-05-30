package com.disp.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 菜单表
 * 
 * @author xuzl
 * @email xzl18614035671@gmail.com
 * @date 2019-05-30 20:00:13
 */
@Data
@TableName("tb_menu")
public class MenuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 菜单/按钮ID
	 */
	@TableId
	private Integer menuId;
	/**
	 * 上级菜单ID
	 */
	private Integer parentId;
	/**
	 * 菜单/按钮名称
	 */
	private String menuName;
	/**
	 * 菜单URL
	 */
	private String url;
	/**
	 * 权限标识
	 */
	private String perms;
	/**
	 * 图标
	 */
	private String icon;
	/**
	 * 类型 0菜单 1按钮
	 */
	private String type;
	/**
	 * 排序
	 */
	private Integer orderNum;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;

}
