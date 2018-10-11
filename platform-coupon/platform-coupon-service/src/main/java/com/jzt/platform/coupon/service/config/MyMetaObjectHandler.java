package com.jzt.platform.coupon.service.config;

import cn.hutool.core.date.DateUtil;
import com.baomidou.mybatisplus.mapper.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

/**
 * project: wechat-root
 * Created by chenghai on 2018/6/22. - 星期五
 */
public class MyMetaObjectHandler extends MetaObjectHandler {

	/**
	 * 测试 user 表 name 字段为空自动填充
	 */
	@Override
	public void insertFill(MetaObject metaObject) {

		// 测试下划线
		Object createTime = getFieldValByName("createTime", metaObject);//mybatis-plus版本2.0.9+
		System.out.println("createTime=" + createTime);
		if (createTime == null) {
			setFieldValByName("createTime", DateUtil.date(), metaObject);//mybatis-plus版本2.0.9+
		}
		Object accountRole = getFieldValByName("accountRole", metaObject);
		if (accountRole == null) {
			//默认角色0 普通用户
			setFieldValByName("accountRole", 0, metaObject);
		}
	}

	@Override
	public void updateFill(MetaObject metaObject) {
		//mybatis-plus版本2.0.9+
		setFieldValByName("updateTime", DateUtil.date(), metaObject);
	}
}