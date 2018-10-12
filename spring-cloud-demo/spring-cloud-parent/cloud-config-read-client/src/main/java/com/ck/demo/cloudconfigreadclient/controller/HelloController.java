package com.ck.demo.cloudconfigreadclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project spring-cloud-parent
 *
 * @author chenghai on 2018/10/12 0012. - 星期五
 * nickName louyedaren
 */
@RestController
public class HelloController {

	@Value("${hello}")
	private String hello;

	@RequestMapping("/hello")
	public String from() {
		return this.hello;
	}

}
