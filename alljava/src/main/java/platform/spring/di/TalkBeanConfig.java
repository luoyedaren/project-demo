package platform.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/12 0012. - 星期六
 * nickName louyedaren
 */
@Configuration
public class TalkBeanConfig {
	@Bean
	public TalkBean getTalkBean(){
		int nextInt = new Random().nextInt(10);
		System.out.println(nextInt);
		TalkBean talkBean = new TalkBean();
		talkBean.setNum(nextInt);
		return talkBean;
	}
}
