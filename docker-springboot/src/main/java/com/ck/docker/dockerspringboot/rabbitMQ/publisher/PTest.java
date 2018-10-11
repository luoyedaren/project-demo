package com.ck.docker.dockerspringboot.rabbitMQ.publisher;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.stream.IntStream;

/**
 * project: docker-springboot
 * Created by chenghai on 2018/8/6 0006. - 星期一
 * author: louyedaren
 */
@Component
public class PTest {

	@Autowired
	private AmqpTemplate amqpTemplate;

	public void send(){
		String context = "hello" + new Date();
		System.out.println("-----------------------------------------sender :" + context);
		this.amqpTemplate.convertAndSend("hello",context);
	}

	public void sendTenMsg(){
		IntStream.rangeClosed(1,10).forEach(i->{
			String msg = "hello" + i + new Date();
			this.amqpTemplate.convertAndSend("toMany", msg);

		});
	}

	public void topicSendExchange(){
		IntStream.rangeClosed(1,10).forEach(i->{
			String msg = "hello" + i + new Date();
			amqpTemplate.convertAndSend("topic","topic.news",msg);
			amqpTemplate.convertAndSend("topic","topic.bbs",msg);

		});
	}

	public void sendDirct(){
		IntStream.rangeClosed(1,10).forEach(i->{
			String msg = "hello" + i + new Date();
			amqpTemplate.convertAndSend("direct","#",msg);

		});
	}





}
