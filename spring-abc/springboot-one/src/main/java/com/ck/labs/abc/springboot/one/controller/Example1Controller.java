package com.ck.labs.abc.springboot.one.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project springboot-one
 *
 * @author chenghai on 2018/11/21 0021. - 星期三
 * nickName louyedaren
 */
@RestController
public class Example1Controller {

	@Autowired

	@GetMapping("example/1")
	public String one(){

		return "example one";
	}

	@GetMapping("/example/2")
	public Object two(){
		return "sdfs";
	}
}
