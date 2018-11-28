package com.ck.labs.abc.springboot.one.properties;

import com.ck.labs.abc.springboot.one.SpringbootOneApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * project springboot-one
 *
 * @author chenghai on 2018/11/22 0022. - 星期四
 * nickName louyedaren
 */
public class PropertiesTest extends SpringbootOneApplicationTests {
	@Autowired
	private AcmeProperties acmeProperties;



	@Test
	public void printTest() {
		System.out.println("acmeProperties---->"+acmeProperties);
	}



	@Test
	public void pritTest2() {
	}
}
