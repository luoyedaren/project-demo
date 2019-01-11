package platform.spring.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/11 0011. - 星期五
 * nickName louyedaren
 */
@Slf4j
@Component
public class NewFunctionImpl implements NewFunction {
	@Override
	public void addNew() {
		log.info("-------------add new function");
	}
}
