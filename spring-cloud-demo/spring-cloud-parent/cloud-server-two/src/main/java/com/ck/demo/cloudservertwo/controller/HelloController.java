package com.ck.demo.cloudservertwo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * project spring-cloud-parent
 *
 * @author chenghai on 2018/10/11 0011. - 星期四
 * nickName louyedaren
 */
@RestController
public class HelloController {

	@RequestMapping("/hello")
	public String index(@RequestParam String name) {
		return "hello "+name+"，this is server tow messge";
	}
}
