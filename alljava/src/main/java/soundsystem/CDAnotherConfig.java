package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/9 0009. - 星期三
 * nickName louyedaren
 */
@Configuration
public class CDAnotherConfig {

	@Bean("chenglongCD")
	public CDInter chengLongCD() {
		return new ChengLongCD();
	}

	@Bean
	public CDInter jackCD(){
		return new GuodegangCD();
	}

	@Bean
	public CDPlayer cdPlayer(CDInter chenglongCD){
		return new CDPlayer(chenglongCD);
	}

	@Bean
	public CDPlayer another(CDInter jackCD) {
		return new CDPlayer(jackCD);
	}

}
