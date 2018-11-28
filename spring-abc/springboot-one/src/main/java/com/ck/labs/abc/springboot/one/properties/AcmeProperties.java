package com.ck.labs.abc.springboot.one.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * project springboot-one
 *
 * @author chenghai on 2018/11/22 0022. - 星期四
 * nickName louyedaren
 */
@ConfigurationProperties("acme")
@Component
@Data
public class AcmeProperties {
	private boolean enabled;

	private InetAddress remoteAddress;

	private final Security security = new Security();

	@Data
	public static class Security {

		private String username;

		private String password;

		private List<String> roles = new ArrayList<>(Collections.singleton("USER"));


	}
}
