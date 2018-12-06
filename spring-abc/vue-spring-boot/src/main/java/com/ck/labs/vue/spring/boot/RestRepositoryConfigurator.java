package com.ck.labs.vue.spring.boot;

import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.stereotype.Component;

/**
 * project vue-spring-boot
 *
 * @author chenghai on 2018/12/6 0006. - 星期四
 * nickName louyedaren
 */
@Component
public class RestRepositoryConfigurator implements RepositoryRestConfigurer {

	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.exposeIdsFor(Todo.class);
	}


}
