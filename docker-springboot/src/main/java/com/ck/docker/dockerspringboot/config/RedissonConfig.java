package com.ck.docker.dockerspringboot.config;

import org.redisson.Redisson;
import org.redisson.api.RKeys;
import org.redisson.api.RList;
import org.redisson.api.RMap;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.TransportMode;

import java.util.stream.Stream;

/**
 * project: docker-springboot
 * Created by chenghai on 2018/8/3 0003. - 星期五
 * author: louyedaren
 */
public class RedissonConfig {



	public static void main(String[] args) {
		RedissonClient redissonClient = initRedissonClient();
		RKeys keys = redissonClient.getKeys();
		System.out.println("打印----------------------");
		Iterable<String> keys1 = keys.getKeys();
		keys1.forEach(s -> System.out.println(s));
		System.out.println(keys.getKeys());

		if (!redissonClient.isShuttingDown()) {

			redissonClient.shutdown();
		}

	}

	public static RedissonClient initRedissonClient(){
		Config config = new Config();
		config.useSingleServer().setAddress("redis://192.168.229.133:6379");
		return Redisson.create(config);
	}

}
