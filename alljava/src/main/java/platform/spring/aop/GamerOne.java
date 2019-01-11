package platform.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/10 0010. - 星期四
 * nickName louyedaren
 */
@Component
@Slf4j
public class GamerOne {

	public void perform() {
		log.info("-------------gameOne go");

	}
}
