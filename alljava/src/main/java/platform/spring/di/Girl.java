package platform.spring.di;

import org.springframework.stereotype.Component;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/8 0008. - 星期二
 * nickName louyedaren
 */
@Component()
public class Girl implements Animal {

	@Override
	public void fight() {
		System.out.println("girl fight : 抓头发!");
	}
}
