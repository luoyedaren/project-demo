package inter.impl;

import inter.TimeInter;

/**
 * project alljava
 *
 * @author chenghai on 2018/9/30 0030. - 星期日
 * nickName louyedaren
 */
public class TimeImpl implements TimeInter {
	@Override
	public long getTime() {
		return System.currentTimeMillis();
	}
}
