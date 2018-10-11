package com.ck.demo.cloudservertwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
public class CloudServerTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudServerTwoApplication.class, args);
	}
}
