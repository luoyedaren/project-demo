package com.ck.labs.abc.redisson.redisson.abc;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.redisson.api.RedissonClient;
import org.redisson.config.SingleServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedissonAbcApplicationTests {
	@Autowired
	RedissonClient redissonClient;

	@Test
	public void contextLoads() {
	}

	@Test
	public void runTest() {
		long count = redissonClient.getKeys().count();
		System.out.println("cout" + count);


	}

	@After
	public void close(){
		redissonClient.shutdown();
		System.out.println("redisson 关闭了");
	}
}
