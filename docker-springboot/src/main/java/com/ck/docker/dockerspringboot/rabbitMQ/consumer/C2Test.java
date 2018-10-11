package com.ck.docker.dockerspringboot.rabbitMQ.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * project: docker-springboot
 * Created by chenghai on 2018/8/6 0006. - 星期一
 * author: louyedaren
 */
@Component
@RabbitListener(queues = {"topic1"})
public class C2Test {

	@RabbitHandler
	public void process(String msg){
		System.out.println("c2---------------------------------"+msg);
	}

}
