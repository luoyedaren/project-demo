package com.ck.labs.abc.redisson.redisson.abc.controller;

import com.google.common.collect.Maps;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.extern.slf4j.Slf4j;
import org.redisson.api.*;
import org.redisson.api.listener.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * project redisson-abc
 *
 * @author chenghai on 2018/11/22 0022. - 星期四
 * nickName louyedaren
 */
@Slf4j
@RestController
public class RedisBasicOpsController {

	@Autowired
	RedissonClient redissonClient;

	@GetMapping("redisson/add")
	public String add(String v){
		long myLong = redissonClient.getAtomicLong("myLong").getAndSet(1L);
		log.info("myLong is {}", myLong);
		return String.valueOf(redissonClient.getDeque("one").add(v));
	}

	//同步执行
	@GetMapping("redisson/sync")
	public String runsync(){
		RAtomicLong myLong = redissonClient.getAtomicLong("myLong");
		return String.valueOf(myLong.compareAndSet(1, 401));
	}

	//异步执行
	@GetMapping("redisson/async")
	public Boolean runAsync(){
		RAtomicLong myLong = redissonClient.getAtomicLong("myLong");
		RFuture<Boolean> booleanRFuture = myLong.compareAndSetAsync(1, 401);
//		if (booleanRFuture.isSuccess()) {
//			return booleanRFuture.getNow();
//		}
		//非阻塞执行
		booleanRFuture.whenComplete((res, exception) -> {
			if (res.booleanValue()) {

			}

		});
		return false;
	}

	@GetMapping("/redisson/put")
	public Object put(){
		Map<String, Object> map = Maps.newHashMap();
		map.put("1", "one");
		map.put("2", "two");
		RBucket<Object> bucket = redissonClient.getBucket("bucket");
		return bucket.getAndSet(map);
	}

	/**
	 * 发布订阅
	 */
	//订阅
	@GetMapping("/redisson/order")
	public Object order(){
		RTopic topicOne = redissonClient.getTopic("topicOne");
		int i = topicOne.addListener(Object.class,new MessageListener<Object>() {
			@Override
			public void onMessage(CharSequence channel, Object msg) {
				System.out.println(msg);

			}
		});
		return false;
	}

//	发布
	@GetMapping("/redisson/publish")
	public Object publish(String msg){
		RTopic topicOne = redissonClient.getTopic("topicOne");
		return topicOne.publish(msg);
	}

}
