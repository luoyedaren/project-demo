package com.ck.labs.abc.springboot.one.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * project springboot-one
 *
 * @author chenghai on 2018/11/21 0021. - 星期三
 * nickName louyedaren
 * 配置
 */
@Component
public class ConfigOne {

	/**
	 * 获取运行参数
	 * @param arguments
	 */
	@Autowired
	public ConfigOne(ApplicationArguments arguments) {
		boolean debug = arguments.containsOption("debug");
		if (!debug) {
			System.out.println("进来 debug");
		}
	}
}
