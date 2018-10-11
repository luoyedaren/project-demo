package inter.impl;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * project alljava
 *
 * @author chenghai on 2018/10/8 0008. - 星期一
 * nickName louyedaren
 */
public class TimeImplTest {
	TimeImpl timeImpl = new TimeImpl();

	@Test
	public void testGetTime() {
		long result = timeImpl.getTime();
		Assert.assertEquals(result, 0L);
	}
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme