package com.ck.docker.dockerspringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DockerSpringbootApplication {


	public static void main(String[] args) {

		SpringApplication.run(DockerSpringbootApplication.class, args);
	}


}
