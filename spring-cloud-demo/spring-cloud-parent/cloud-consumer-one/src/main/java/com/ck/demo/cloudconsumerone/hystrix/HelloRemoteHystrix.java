package com.ck.demo.cloudconsumerone.hystrix;

import com.ck.demo.cloudconsumerone.inter.HelloRemote;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * project spring-cloud-parent
 *
 * @author chenghai on 2018/10/11 0011. - 星期四
 * nickName louyedaren
 */
@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
	public String hello(@RequestParam(value = "name") String name) {
		return "hello" +name+", this messge send failed ";
	}
}