package soundsystem;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.testng.Assert.assertNotNull;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/9 0009. - 星期三
 * nickName louyedaren
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDAnotherConfig.class)
public class CDPlayerAnotherTest {
	@Autowired
	CDPlayer cdPlayer;
	@Autowired
	CDPlayer another;

	@org.junit.Test
	public void play() {
		assertNotNull(cdPlayer);
		assertNotNull(another);
	}
}
