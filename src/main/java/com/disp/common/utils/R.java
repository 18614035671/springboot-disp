/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 *
 * https://www.renren.io
 *
 * 版权所有，侵权必究！
 */

package com.disp.common.utils;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.disp.common.enums.ResultEnum;
import com.disp.sys.entity.UserEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 返回数据
 *
 * @author Mark sunlightcs@gmail.com
 */
public class R extends HashMap<String, Object> {
	private static final long serialVersionUID = 1L;


	private R() {
		put("code", ResultEnum.SUCCESS.getCode());
		put("msg", ResultEnum.SUCCESS.getMessage());
	}

	public static R error() {
		return error(ResultEnum.FAILED.getCode(),ResultEnum.FAILED.getMessage());
	}

	public static R error(String msg) {
		return error(ResultEnum.FAILED.getCode(), msg);
	}

	public static R error(ResultEnum result) {
		return error(result.getCode(), result.getMessage());
	}

	private static R error(int code, String msg) {
		R r = new R();
		r.put("code", code);
		r.put("msg", msg);
		return r;
	}

	public static R ok(String msg) {
		R r = new R();
		r.put("msg", msg);
		return r;
	}

	public static R ok(Object object) {
		R r = new R();
		if(object!=null){
			r.put("data",object);
		}
		return r;
	}

	/**
	 * 分页
	 *
	 * @param page
	 * @return
	 * @Author: xuzilong
	 * @Date: 2019年07月10日
	 **/
	public static R okPage(IPage<?> page) {
		R r = new R();
		r.put("code", ResultEnum.SUCCESS.getCode());// 状态固定为成功
		r.put("msg",  ResultEnum.SUCCESS.getMessage());// 提示信息
		r.put("totalRow", page.getTotal());// 总记录数
		r.put("totalPage", page.getPages());// 总页数
		r.put("data", page.getRecords());// 结果明细
		return r;
	}

	public static R ok() {
		return new R();
	}
}
