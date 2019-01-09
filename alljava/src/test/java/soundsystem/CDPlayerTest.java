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
@ContextConfiguration(classes = CDConfig.class)
public class CDPlayerTest {
	@Autowired
	GuodegangCD guodegangCD;

	@org.junit.Test
	public void play() {
		assertNotNull(guodegangCD);
		guodegangCD.play();
	}
}
