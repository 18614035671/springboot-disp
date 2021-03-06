package com.disp.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * 
 * @author xuzl
 * @email 18614035671@163.com
 * @date 2019-05-30 20:00:13
 */
@Data
@TableName("tb_user")
public class UserEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 账户状态
	 */
	public static final String STATUS_VALID = "1";

	public static final String STATUS_LOCK = "0";

	public static final String DEFAULT_THEME = "green";

	public static final String DEFAULT_AVATAR = "default.jpg";

	/**
	 * 性别
	 */
	public static final String SEX_MALE = "0";

	public static final String SEX_FEMALE = "1";

	public static final String SEX_UNKNOW = "2";

	/**
	 * 用户ID
	 */
	@TableId
	private Integer userId;
	/**
	 * 用户名
	 */
	private String username;
	/**
	 * 密码
	 */
	private String password;
	/**
	 * 部门ID
	 */
	private Integer deptId;
	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 联系电话
	 */
	private String mobile;
	/**
	 * 状态 0锁定 1有效
	 */
	private String status;
	/**
	 * 创建时间
	 */
	private Date crateTime;
	/**
	 * 修改时间
	 */
	private Date modifyTime;
	/**
	 * 最近访问时间
	 */
	private Date lastLoginTime;
	/**
	 * 性别 0男 1女
	 */
	private String ssex;
	/**
	 * 主题
	 */
	private String theme;
	/**
	 * 头像
	 */
	private String avatar;
	/**
	 * 描述
	 */
	private String description;


}
