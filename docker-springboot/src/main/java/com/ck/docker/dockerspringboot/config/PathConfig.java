package com.ck.docker.dockerspringboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * project: docker-springboot
 * Created by chenghai on 2018/8/2 0002. - 星期四
 * author: louyedaren
 */

@Configuration
public class PathConfig {
	String url;

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
