package com.ck.labs.mail.mail.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

@SpringBootApplication
public class MailDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailDemoApplication.class, args);
	}

}
