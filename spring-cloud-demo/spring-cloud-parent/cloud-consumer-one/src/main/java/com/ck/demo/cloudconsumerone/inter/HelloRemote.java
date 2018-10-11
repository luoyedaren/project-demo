package com.ck.demo.cloudconsumerone.inter;

import com.ck.demo.cloudconsumerone.hystrix.HelloRemoteHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * project spring-cloud-parent
 *
 * @author chenghai on 2018/10/11 0011. - 星期四
 * nickName louyedaren
 */
@FeignClient(name= "spring-cloud-producer",fallback = HelloRemoteHystrix.class)
@Component
public interface HelloRemote {
	@RequestMapping(value = "/hello")
	String hello(@RequestParam(value = "name") String name);


}