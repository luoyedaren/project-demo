package com.ck.docker.dockerspringboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project: docker-springboot
 * Created by chenghai on 2018/8/1 0001. - 星期三
 * author: louyedaren
 */
@RestController
public class HelloDockerController {


	@RequestMapping("/")
	public String index(){

		return "hello docker";
	}

	@RequestMapping("docker/hello")
	public String hellDocker(){
		return "hello docker";
	}
}
