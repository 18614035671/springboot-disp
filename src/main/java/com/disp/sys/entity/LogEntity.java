package com.disp.sys.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.io.Serializable;
import java.util.Date;

/**
 * 操作日志表
 * 
 * @author xuzl
 * @email xzl18614035671@gmail.com
 * @date 2019-05-30 20:00:13
 */
@Data
@TableName("tb_log")
public class LogEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 日志ID
	 */
	@TableId
	private Integer id;
	/**
	 * 操作用户
	 */
	private String username;
	/**
	 * 操作内容
	 */
	private String operation;
	/**
	 * 耗时
	 */
	private BigDecimal time;
	/**
	 * 操作方法
	 */
	private String method;
	/**
	 * 方法参数
	 */
	private String params;
	/**
	 * 操作者IP
	 */
	private String ip;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 操作地点
	 */
	private String location;

}
