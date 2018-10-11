package com.ck.docker.dockerspringboot;

import com.ck.docker.dockerspringboot.rabbitMQ.publisher.PTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.IntStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DockerSpringbootApplicationTests {

	@Autowired
	private PTest pTest;

	@Test
	public void contextLoads() {
	}

	@Test
	public void hello(){
		pTest.send();

	}

	@Test
	public void sendTen(){
		pTest.sendTenMsg();

	}

	@Test
	public void sendExchange(){
		pTest.topicSendExchange();
	}

	@Test
	public void sendDirect(){
		pTest.sendDirct();
	}


}
