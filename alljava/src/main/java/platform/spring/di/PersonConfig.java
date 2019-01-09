package platform.spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/8 0008. - 星期二
 * nickName louyedaren
 */
@Configuration
@ComponentScan("platform.spring.di")
public class PersonConfig {

	@Bean
	public Girl girl(){
		return new Girl();
	}
}
