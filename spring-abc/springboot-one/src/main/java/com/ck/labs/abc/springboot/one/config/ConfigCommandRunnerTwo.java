package com.ck.labs.abc.springboot.one.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 * project springboot-one
 *
 * @author chenghai on 2018/11/21 0021. - 星期三
 * nickName louyedaren
 */
@Component
//@Order(1)  //多个command执行 顺序定义方式 ：1.注解 2. 实现 org.springframework.core.Ordered
public class ConfigCommandRunnerTwo implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("SpringApplication.run(SpringbootOneApplication.class, args)执行完成后，执行一次 order 0");
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
