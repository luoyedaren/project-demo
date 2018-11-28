package com.ck.labs.abc.springboot.one;

import javafx.scene.Parent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootOneApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringbootOneApplication.class, args);

		//流式编程
		new SpringApplicationBuilder().sources(Parent.class).child(SpringbootOneApplication.class)
				.build().run(args);
	}
}
