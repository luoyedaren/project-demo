package com.jzt.platform.coupon.service.config;

import com.baomidou.mybatisplus.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * project: wechat-root
 * Created by chenghai on 2018/6/27. - 星期三
 */
@EnableTransactionManagement
@Configuration
@MapperScan("com.jzt.platform.coupon.service.*.mapper*")
public class MybatisPlusConfig {
	/**
	 * 分页插件
	 */
	@Bean
	public PaginationInterceptor paginationInterceptor() {
		return new PaginationInterceptor();
	}
}
