import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * project alljava
 *
 * @author chenghai on 2018/9/30 0030. - 星期日
 * nickName louyedaren
 */
public class CaculatorTest {

	@Test
	public void testAdd() {
		assertEquals(Caculator.add(1,1),2);
	}
}