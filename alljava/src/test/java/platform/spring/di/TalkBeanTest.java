package platform.spring.di;

import base.BaseSpringTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/12 0012. - 星期六
 * nickName louyedaren
 */
@ContextConfiguration(classes = TalkBeanConfig.class)
public class TalkBeanTest extends BaseSpringTest {
	@Autowired
	TalkBean talkBean;
	@Test
	@Repeat(10)
	public void beanTest() {
		System.out.println(talkBean);
	}
}