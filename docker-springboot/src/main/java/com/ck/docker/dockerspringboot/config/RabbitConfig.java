package com.ck.docker.dockerspringboot.config;

import org.springframework.amqp.core.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * project: docker-springboot
 * Created by chenghai on 2018/8/6 0006. - 星期一
 * author: louyedaren
 */
@Configuration
public class RabbitConfig {
	String topic1 = "topic1";
	String topic2 = "topic2";

	String topicRoutingKey = "topic.#";

	@Bean
	Queue helloQueue(){

		return new Queue("hello");
	}

	@Bean
	Queue manyMsgQueue(){
		return new Queue("toMany");
	}

	@Bean
	Queue topic1(){
		return new Queue(topic1);
	}

	@Bean
	Queue topic2(){
		return new Queue(topic2);
	}

	@Bean
	public TopicExchange exchange(){
		return new TopicExchange("topic");
	}

	@Bean
	DirectExchange directExchange(){
		return new DirectExchange("direct");
	}


	@Bean
	public Binding bindingExchange1(TopicExchange topicExchange,Queue topic1) {
		return BindingBuilder.bind(topic1).to(topicExchange).with(topicRoutingKey);
	}

	@Bean
	public Binding bindingExchange2(TopicExchange topicExchange,Queue topic2) {
		return BindingBuilder.bind(topic2).to(topicExchange).with(topicRoutingKey);
	}

	@Bean
	Binding bindingMoreQueue(DirectExchange directExchange, Queue manyMsgQueue){
		return BindingBuilder.bind(manyMsgQueue).to(directExchange).with("#");
	}

	@Bean
	Binding bindingBuilder(DirectExchange directExchange, Queue helloQueue){
		return BindingBuilder.bind(helloQueue).to(directExchange).with("#");
	}



}
