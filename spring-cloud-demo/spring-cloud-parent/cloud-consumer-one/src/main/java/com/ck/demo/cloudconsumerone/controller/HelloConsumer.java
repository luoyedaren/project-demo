package com.ck.demo.cloudconsumerone.controller;

import com.ck.demo.cloudconsumerone.inter.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * project spring-cloud-parent
 *
 * @author chenghai on 2018/10/11 0011. - 星期四
 * nickName louyedaren
 */
@RestController
public class HelloConsumer {

	@Autowired
	HelloRemote helloRemote;


	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return helloRemote.hello(name);
	}


}
