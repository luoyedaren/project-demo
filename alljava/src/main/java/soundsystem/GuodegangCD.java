package soundsystem;

import org.springframework.stereotype.Component;

/**
 * project alljava
 *
 * @author chenghai on 2019/1/9 0009. - 星期三
 * nickName louyedaren
 */
@Component
public class GuodegangCD implements CDInter {

	public GuodegangCD() {
		System.out.println("郭德纲来了 ");
	}

	@Override
	public void play() {
		System.out.println("郭德纲来了");
	}
}
