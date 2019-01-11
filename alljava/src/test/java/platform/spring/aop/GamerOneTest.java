package platform.spring.aop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.annotation.Repeat;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/10 0010. - 星期四
 * nickName louyedaren
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AOPConfig.class)
@EnableAspectJAutoProxy
public class GamerOneTest{
	@Autowired
	GamerOne gamerOne;

	@Test
//	@Repeat(10)
	public void platform() {
		gamerOne.perform();
	}
}
