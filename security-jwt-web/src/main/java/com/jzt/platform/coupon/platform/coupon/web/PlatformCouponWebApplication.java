package com.jzt.platform.coupon.platform.coupon.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;

import java.util.List;

@SpringBootApplication
@EnableAutoConfiguration
public class PlatformCouponWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatformCouponWebApplication.class, args);
	}

}
