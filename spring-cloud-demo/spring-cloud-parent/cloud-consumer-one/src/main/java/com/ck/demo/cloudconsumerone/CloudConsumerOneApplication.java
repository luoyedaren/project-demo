package com.ck.demo.cloudconsumerone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
@EnableFeignClients
public class CloudConsumerOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConsumerOneApplication.class, args);
	}
}
