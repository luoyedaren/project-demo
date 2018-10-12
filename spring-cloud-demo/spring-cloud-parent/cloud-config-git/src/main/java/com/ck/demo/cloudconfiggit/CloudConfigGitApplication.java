package com.ck.demo.cloudconfiggit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigGitApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigGitApplication.class, args);
	}
}
